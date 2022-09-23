![Eclipse Marketplace](https://img.shields.io/eclipse-marketplace/v/m2e-chromatic?color=light-green)

M2E Chromatic
-------------

### :warning: This feature is now baked into m2e 2.x, therefore this repo is archived

[Maven launch participant](https://github.com/fbricon/m2e.colored.console/blob/66e005cd70ea2cb068663c8a763f53319dc02383/src/main/java/m2e/colored/console/ColoredMavenLaunchParticipant.java#L12-L22) enabling colored output when the [ANSI Escape in Console plugin](https://marketplace.eclipse.org/content/ansi-escape-console) is installed.

See [bug 544307](https://bugs.eclipse.org/bugs/show_bug.cgi?id=544307).

<img width="1357" alt="screen shot 2019-02-11 at 6 33 30 pm" src="https://user-images.githubusercontent.com/148698/52601092-aea48600-2e2b-11e9-9514-600799ffe13b.png">

Installation
------------
_M2E Chromatic_ is available in the [Eclipse Marketplace](https://marketplace.eclipse.org/content/m2e-chromatic). Drag to the following button to your running Eclipse workspace. (⚠ *Requires the Eclipse Marketplace Client*)

[![Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client](https://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.svg)](http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=4511509 "Drag to your running Eclipse* workspace. *Requires Eclipse Marketplace Client")

Alternatively, in Eclipse:

- open Help > Install New Software...
- work with: `https://sidespin.github.io/m2e-chromatic/update/`
- expand the category and select the JRE Discovery Feature
- proceed with the installation
- restart Eclipse

Build
-----
Requires Java 11 to build (but Java 1.8 to run).

Open a terminal and execute the following command:
- On Linux/Mac:

> ./mvnw clean verify
    
- On Windows:
    
> mvnw.cmd clean verify

You can then install the generated update site from `m2e.chromatic.site/target/repository`

License
-------
Licensed under the [EPL-2.0](https://www.eclipse.org/legal/epl-2.0/).
