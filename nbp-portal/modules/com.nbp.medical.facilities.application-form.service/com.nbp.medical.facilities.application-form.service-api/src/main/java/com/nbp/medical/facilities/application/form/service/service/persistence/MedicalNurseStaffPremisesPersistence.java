/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.medical.facilities.application.form.service.exception.NoSuchMedicalNurseStaffPremisesException;
import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the medical nurse staff premises service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremisesUtil
 * @generated
 */
@ProviderType
public interface MedicalNurseStaffPremisesPersistence
	extends BasePersistence<MedicalNurseStaffPremises> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MedicalNurseStaffPremisesUtil} to access the medical nurse staff premises persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalNurseStaffPremisesException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical nurse staff premises
	 * @throws NoSuchMedicalNurseStaffPremisesException if a matching medical nurse staff premises could not be found
	 */
	public MedicalNurseStaffPremises findBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalNurseStaffPremisesException;

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical nurse staff premises, or <code>null</code> if a matching medical nurse staff premises could not be found
	 */
	public MedicalNurseStaffPremises fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId);

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical nurse staff premises, or <code>null</code> if a matching medical nurse staff premises could not be found
	 */
	public MedicalNurseStaffPremises fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId, boolean useFinderCache);

	/**
	 * Removes the medical nurse staff premises where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical nurse staff premises that was removed
	 */
	public MedicalNurseStaffPremises removeBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws NoSuchMedicalNurseStaffPremisesException;

	/**
	 * Returns the number of medical nurse staff premiseses where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical nurse staff premiseses
	 */
	public int countBygetMedicalFacilities_ByAppId(long medicalFacilitiesAppId);

	/**
	 * Caches the medical nurse staff premises in the entity cache if it is enabled.
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 */
	public void cacheResult(
		MedicalNurseStaffPremises medicalNurseStaffPremises);

	/**
	 * Caches the medical nurse staff premiseses in the entity cache if it is enabled.
	 *
	 * @param medicalNurseStaffPremiseses the medical nurse staff premiseses
	 */
	public void cacheResult(
		java.util.List<MedicalNurseStaffPremises> medicalNurseStaffPremiseses);

	/**
	 * Creates a new medical nurse staff premises with the primary key. Does not add the medical nurse staff premises to the database.
	 *
	 * @param medicalNurseStaffPremisesId the primary key for the new medical nurse staff premises
	 * @return the new medical nurse staff premises
	 */
	public MedicalNurseStaffPremises create(long medicalNurseStaffPremisesId);

	/**
	 * Removes the medical nurse staff premises with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	public MedicalNurseStaffPremises remove(long medicalNurseStaffPremisesId)
		throws NoSuchMedicalNurseStaffPremisesException;

	public MedicalNurseStaffPremises updateImpl(
		MedicalNurseStaffPremises medicalNurseStaffPremises);

	/**
	 * Returns the medical nurse staff premises with the primary key or throws a <code>NoSuchMedicalNurseStaffPremisesException</code> if it could not be found.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	public MedicalNurseStaffPremises findByPrimaryKey(
			long medicalNurseStaffPremisesId)
		throws NoSuchMedicalNurseStaffPremisesException;

	/**
	 * Returns the medical nurse staff premises with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises, or <code>null</code> if a medical nurse staff premises with the primary key could not be found
	 */
	public MedicalNurseStaffPremises fetchByPrimaryKey(
		long medicalNurseStaffPremisesId);

	/**
	 * Returns all the medical nurse staff premiseses.
	 *
	 * @return the medical nurse staff premiseses
	 */
	public java.util.List<MedicalNurseStaffPremises> findAll();

	/**
	 * Returns a range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @return the range of medical nurse staff premiseses
	 */
	public java.util.List<MedicalNurseStaffPremises> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical nurse staff premiseses
	 */
	public java.util.List<MedicalNurseStaffPremises> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalNurseStaffPremises> orderByComparator);

	/**
	 * Returns an ordered range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical nurse staff premiseses
	 */
	public java.util.List<MedicalNurseStaffPremises> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MedicalNurseStaffPremises> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the medical nurse staff premiseses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of medical nurse staff premiseses.
	 *
	 * @return the number of medical nurse staff premiseses
	 */
	public int countAll();

}