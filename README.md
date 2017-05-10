# gradle-plugin-function-export

This is a functional example that exports a function (*Closure*) from a Gradle
plugin.

## Running

To try it out you can install the plugin into the local Maven repository.
```
plugin$ gradle install
```

and then test it in the 'user' project.
```
user$ gradle
```

## Important

This method writes (*injects*) to the "Extra properties" if the project.
This raises the possibility of a **name collision and functions being overwritten**.
If this is a risk it is better to use **static imports** instead.

### Static Imports as an alternative

Static imports allow resolving potential name conflicts with the
**import ... as** mechanism.

**module.groovy**
```
def static func(...)
```

**user.groovy**
```
import static module.func as func
```


*This example was sponsored by Vaisala Oyj.*
