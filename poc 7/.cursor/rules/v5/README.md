.cursor/
└── rules/
    ├── _core/
    │   ├── global.mdc
    │   ├── architecture.mdc
    │   └── conventions.mdc           ← naming, empaquetado y estilo
    ├── api/
    │   ├── controllers.mdc
    │   ├── dtos.mdc
    │   └── exception-handling.mdc
    ├── domain/
    │   ├── entities.mdc
    │   └── value-objects.mdc         ← opcional, si tienes modelos con lógica inmutable
    ├── service/
    │   ├── services.mdc
    │   ├── transactions.mdc          ← opcional, para control transaccional
    │   └── validation.mdc            ← validaciones de negocio o input
    ├── persistence/
    │   ├── repositories.mdc
    │   └── datasource.mdc            ← configuración de conexión DB, JPA, etc.
    ├── config/
    │   ├── security.mdc              ← manejo de JWT, roles, filtros
    │   ├── logging.mdc
    │   └── application.mdc
    ├── utils/
    │   ├── helpers.mdc
    │   └── constants.mdc
    ├── testing/
    │   ├── unit-tests.mdc
    │   ├── integration-tests.mdc
    │   └── testcontainers.mdc        ← si usas contenedores de prueba
    └── documentation/
        └── swagger-and-readme.mdc
