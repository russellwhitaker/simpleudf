# {{name}}

Describe your {{name}} libraries and the Hadoop Hive UDF which wraps them and
makes them available to your users in the Hadoop Hive environment.

## Usage

Tell your users how to generate the {{name}} jarfile they need to copy to HDFS on
their Hadoop cluster.

Tell them how to:

```
hive> add jar {{name}}-<version>;
hive> create temporary function {{name}} as '{{name}}.hive.udf.{{class-name}}';
```

## Testing

This project uses the [Speclj BDD testing framework](http://speclj.com/).

Write your tests first in `spec/{{name}}/core_spec.clj`, run them expecting them to
fail, then implement your test-passing functions in `src/{{name}}/core.clj`. Always
do this, running your tests on a regular rhythm along with your production code:

```bash
→ lein spec --reporter=d
Compiling {{name}}.core
Compiling {{name}}.hive.udf.{{class-name}}

Salutation
- should be warmly welcoming to Bob Dobbs

Valediction
- should be wistfully leave-taking of Bob Dobbs

Finished in 0.00035 seconds
2 examples, 0 failures
```

## License

Copyright © 2015 YOUR_NAME

Distributed under the LICENSE_OF_YOUR_CHOICE.
