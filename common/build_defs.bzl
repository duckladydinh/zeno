def java_elf(name, java_binary):
    native.genrule(
        name = name + "_genrule",
        srcs = [java_binary + "_deploy.jar"],
        outs = [name],
        cmd = """
        echo '#!/usr/bin/java -jar' | cat - $< > $@
		""",
    )
