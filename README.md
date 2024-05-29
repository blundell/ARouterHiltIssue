Reproducer Project

Arouter + Hilt build failure

```bash
:app:hiltJavaCompileDebug FAILED	
error: ARouter::Compiler An exception is encountered, [These no module name, at 'build.gradle', like :	
  android {	
      defaultConfig {	
          ...	
          javaCompileOptions {	
              annotationProcessorOptions {	
                  arguments = [AROUTER_MODULE_NAME: project.getName()]	
              }	
          }	
      }	
  }	
  ]	
1 error
```

In toml, if:


```hilt_gradle_plugin = "2.45" ```

Then `./gradlew build` succeeds.

___

If 

```hilt_gradle_plugin = "2.46" ``` (or higher)

Then `./gradlew build` fails.
