# dctm-docapp
Continuous Deployment of Documentum Docapp archive is still a challenge due to Composer's dependency on packaging of Jars in the Documentum Archive(DAR).

In order to make this possible, we could integrate the creation of DAR into Maven projects and the DAR can then be deployed using a custom plugin on DeployIt or other tools.

## Prerequisites
- Documentum Composer
- Documentum Headless Composer
- Java IDE with Maven Integration

Checkout my commit https://github.com/abykoshy/dctm-docapp/commit/c6a72f5c8eddad6b5f66d9ee7984c1b75ee1dbad to see the manual changes done on the artifacts to use the generated jars and dependencies
