from fastapi import FastAPI


def create_app() -> FastAPI:
    app = FastAPI(title="POC 2 API", version="0.1.0")

    @app.get("/health")
    def health_check() -> dict:
        return {"status": "ok"}

    return app


app = create_app()

