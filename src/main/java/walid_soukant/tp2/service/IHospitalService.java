package walid_soukant.tp2.service;

import walid_soukant.tp2.entities.Consultation;
import walid_soukant.tp2.entities.Medecin;
import walid_soukant.tp2.entities.Patient;
import walid_soukant.tp2.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
