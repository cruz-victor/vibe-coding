# POC 2 - FastAPI con uv

Proyecto mínimo de una API con FastAPI usando `uv` para entorno y dependencias.

## Requisitos
- Python >= 3.10
- `uv` instalado globalmente (ver `https://docs.astral.sh/uv/#installation`)

## Estructura
```
src/
  app/
    __init__.py
    main.py
pyproject.toml
.gitignore
```

## Comandos con uv

### 1) Inicializar proyecto (si empiezas desde cero)
```bash
uv init poc-2
cd poc-2
```

### 2) Instalar dependencias
```bash
uv add fastapi uvicorn[standard] python-dotenv pydantic
```
Si ya clonaste este repo:
```bash
uv sync
```

### 3) Ejecutar en desarrollo
```bash
uv run uvicorn app.main:app --reload --host 0.0.0.0 --port 8000
```

### 4) Probar healthcheck
```bash
curl http://127.0.0.1:8000/health
```
Respuesta esperada: `{ "status": "ok" }`

## Archivo principal
`src/app/main.py` crea la app y el endpoint `/health`.
