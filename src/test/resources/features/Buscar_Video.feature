#language: es

  Característica: Buscar el trailer del videojuego Wild Hearts de PS5
    Como analista QA necesito ingresar al portal IGNy buscar el trailer de un videojugo reciente

    @test1
    Escenario: Mostrar el trailer del videojuego Wild Hearts de PS5 exitosamente
      Dado que el usuario ingresa a la pagina principal del portal de IGN Latinoamerica
      Cuando se selecciona la opcion PS
      Y se selecciona la noticia del videojuego Wild Hearths-Review
      Entonces se valida la pagina del review Wild Hearths
      Y se da scroll hasta la galeria de imagenes

