# ConjuntoJPA
# ConjuntoJPA

@Query("SELECT p FROM propietario p LEFT JOIN FETCH p.visitantes WHERE p.id_propietario = :id")
propietario findPropietarioConVisitantes(Long id);

¿Qué hace esta consulta?
Esta consulta busca un propietario por su ID y, al mismo tiempo, trae la lista de sus visitantes usando LEFT JOIN FETCH. Esto permite cargar los visitantes relacionados en una sola consulta, evitando errores de LazyInitialization y mejorando el rendimiento.

 ReservaParqueaderoRepositorio

@Query("SELECT r FROM reserva_parqueadero r WHERE r.propietario.id_propietario = :idPropietario")
reserva_parqueadero findByPropietarioId(Long idPropietario);

¿Qué hace esta consulta?
Obtiene la reserva de parqueadero asociada a un propietario específico, usando el ID del propietario como filtro. Es útil para mostrar la reserva de parqueadero que hizo un propietario en particular.

ReservaZonaRepositorio

@Query("SELECT r FROM reserva_zona r WHERE r.fecha = :fecha")
List<reserva_zona> findByFecha(LocalDate fecha);

¿Qué hace esta consulta?
Devuelve una lista de reservas de zonas sociales para una fecha específica. Sirve para verificar qué zonas han sido reservadas en un determinado día.

@Query("SELECT r FROM reserva_parqueadero r WHERE r.propietario.id_propietario = :idPropietario")
reserva_parqueadero findByPropietarioId(Long idPropietario);

¿Qué hace esta consulta?
Obtiene la reserva de parqueadero asociada a un propietario específico, usando el ID del propietario como filtro. Es útil para mostrar la reserva de parqueadero que hizo un propietario en particular.


Controladores de la API
Los controladores definen las rutas HTTP que permiten a los usuarios del sistema interactuar con los datos. Cada controlador está asociado a un servicio que contiene la lógica del negocio.

PropietarioControlador
Rutas disponibles:

POST /api/propietarios/guardar: Guarda un nuevo propietario recibido en formato JSON.

GET /api/propietarios/listar: Devuelve una lista con todos los propietarios registrados en la base de datos.

Este controlador trabaja con el servicio PropietarioServicio, el cual también permite obtener un propietario con sus visitantes usando una consulta personalizada.

ReservaParqueaderoControlador
Rutas disponibles:

POST /api/reservas-parqueadero/guardar: Guarda una nueva reserva de parqueadero.

GET /api/reservas-parqueadero/listar: Devuelve todas las reservas de parqueadero registradas.

GET /api/reservas-parqueadero/por-propietario/{id}: Busca la reserva de parqueadero asociada al propietario con el ID proporcionado.

Este controlador utiliza una consulta personalizada que filtra las reservas por el ID del propietario.

ReservaZonaControlador
Rutas disponibles:

POST /api/reservas-zona/guardar: Guarda una nueva reserva de una zona social.

GET /api/reservas-zona/listar: Devuelve una lista con todas las reservas de zonas sociales.

En el repositorio correspondiente existe una consulta personalizada que permite buscar reservas por fecha, la cual se puede utilizar en este controlador si se desea extender.

VisitanteControlador
Rutas disponibles:

POST /api/visitantes/guardar: Guarda un nuevo visitante.

GET /api/visitantes/listar: Lista todos los visitantes registrados.

Los visitantes están relacionados con los propietarios, lo cual se maneja desde el modelo y servicio correspondiente.

ZonaSocialControlador
Rutas disponibles:

POST /api/zonas-sociales/guardar: Guarda una nueva zona social disponible en el conjunto.

GET /api/zonas-sociales/listar: Lista todas las zonas sociales registradas.

Estas zonas pueden ser reservadas posteriormente mediante las funcionalidades del módulo de reservas.