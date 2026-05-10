# Sistema Web para la Gestión de Reparaciones Vehiculares - Taller Mecánico
**Asignatura:** Construcción de Software
**Semestre:** 2026-05
**Avance:** 1 (Proyecto Grupal)

## 📋 Descripción del Proyecto
Este proyecto es un sistema con arquitectura por capas diseñado para gestionar el registro de clientes, vehículos y órdenes de reparación en un taller mecánico. En este primer avance, se presenta la configuración base de la arquitectura (Modelo, Datos, Lógica, Vista) y la conexión exitosa con la base de datos relacional.

## 🛠️ Tecnologías y Requisitos
- **Lenguaje:** Java (JDK 21)
- **IDE Recomendado:** Apache NetBeans (versión 17 o superior)
- **Base de Datos:** MariaDB / MySQL
- **Gestor de Base de Datos:** HeidiSQL
- **Driver / Conector:** MariaDB Java Client (v3.5.8)

## 📁 Estructura del Repositorio
Siguiendo los lineamientos de la rúbrica, el proyecto se divide en:
- `/codigo/backend`: Contiene el proyecto Java (TallerMecanicoALP) con la arquitectura por capas.
- `/codigo/frontend`: (Reservado para futuras vistas web).
- `/codigo/sql`: Contiene el script `taller_alp.sql` para generar la base de datos.
- `/documentacion`: Contiene el Avance del Artículo Científico (Diagrama de Componentes), la Bitácora de Actividades grupales y las capturas de evidencia.

##  Instrucciones de Ejecución

Siga estos pasos detallados para abrir y ejecutar el proyecto en su entorno local:

### 1. Configuración de la Base de Datos
1. Abra su gestor de base de datos (ej. HeidiSQL) y conéctese a su servidor local (localhost).
2. Localice el archivo ubicado en la carpeta `codigo/sql/taller_alp.sql`.
3. Ejecute el script completo. Esto creará automáticamente la base de datos llamada `taller_alp_db` junto con las tablas `clientes`, `vehiculos` y `reparaciones`.

### 2. Apertura del Proyecto en el IDE
1. Abra Apache NetBeans.
2. Vaya a `File > Open Project...` y seleccione la carpeta `TallerMecanicoALP` ubicada dentro de `codigo/backend`.
3. Verifique que la librería de conexión esté cargada: En el panel de *Projects*, despliegue la carpeta *Libraries*. Si marca un error, haga clic derecho > *Add JAR/Folder...* y seleccione el archivo `mariadb-java-client-3.5.8.jar` incluido.

### 3. Configuración de Credenciales
1. Dentro del proyecto en NetBeans, navegue hasta el paquete `com.alp.taller.data` y abra la clase `Conexion.java`.
2. Verifique la variable `PASSWORD`. Si su servidor local tiene una contraseña, colóquela entre las comillas (ej. `private static final String PASSWORD = "root";`). Si no utiliza contraseña, déjelo vacío `""`.

### 4. Compilación y Prueba
1. Diríjase a la clase principal `TallerMecanicoALP.java` ubicada en el paquete raíz `tallermecanicoalp