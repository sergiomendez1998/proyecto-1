package servicio;

import modelo.Salon;

import java.util.List;

public class SalonServiceImpl implements SalonInterface{
	/**
	 * @param salon
	 * @return
	 */
	@Override
	public String guardarSalon(Salon salon) {
		Salon existe = Salon.listaSalones.stream().filter(sal->sal.getNombre().equalsIgnoreCase(salon.getNombre()))
				.findFirst().orElse(null);

		if(existe ==null) {
			int id = Salon.listaSalones.size() + 1;
			Salon.listaSalones.add(salon);
			return "registro guardado!";
		}else{
			return "registro ya existe";
		}
	}

	/**
	 * @param salon
	 * @return
	 */
	@Override
	public String modificarSalon(Salon salon) {
		return null;
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	public String eliminarSalonPorId(int id) {
		return null;
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	public Salon buscarSalonPorId(int id) {
		return null;
	}

	/**
	 * @return
	 */
	@Override
	public List<Salon> salones() {
		return null;
	}
}
