/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical nurse staff premises service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalNurseStaffPremisesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremisesPersistence
 * @generated
 */
public class MedicalNurseStaffPremisesUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		getPersistence().clearCache(medicalNurseStaffPremises);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, MedicalNurseStaffPremises>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalNurseStaffPremises> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalNurseStaffPremises> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalNurseStaffPremises> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalNurseStaffPremises> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalNurseStaffPremises update(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return getPersistence().update(medicalNurseStaffPremises);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalNurseStaffPremises update(
		MedicalNurseStaffPremises medicalNurseStaffPremises,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalNurseStaffPremises, serviceContext);
	}

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalNurseStaffPremisesException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical nurse staff premises
	 * @throws NoSuchMedicalNurseStaffPremisesException if a matching medical nurse staff premises could not be found
	 */
	public static MedicalNurseStaffPremises findBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalNurseStaffPremisesException {

		return getPersistence().findBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical nurse staff premises, or <code>null</code> if a matching medical nurse staff premises could not be found
	 */
	public static MedicalNurseStaffPremises fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		return getPersistence().fetchBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical nurse staff premises where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical nurse staff premises, or <code>null</code> if a matching medical nurse staff premises could not be found
	 */
	public static MedicalNurseStaffPremises fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId, useFinderCache);
	}

	/**
	 * Removes the medical nurse staff premises where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical nurse staff premises that was removed
	 */
	public static MedicalNurseStaffPremises
			removeBygetMedicalFacilities_ByAppId(long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalNurseStaffPremisesException {

		return getPersistence().removeBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical nurse staff premiseses where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical nurse staff premiseses
	 */
	public static int countBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical nurse staff premises in the entity cache if it is enabled.
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 */
	public static void cacheResult(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		getPersistence().cacheResult(medicalNurseStaffPremises);
	}

	/**
	 * Caches the medical nurse staff premiseses in the entity cache if it is enabled.
	 *
	 * @param medicalNurseStaffPremiseses the medical nurse staff premiseses
	 */
	public static void cacheResult(
		List<MedicalNurseStaffPremises> medicalNurseStaffPremiseses) {

		getPersistence().cacheResult(medicalNurseStaffPremiseses);
	}

	/**
	 * Creates a new medical nurse staff premises with the primary key. Does not add the medical nurse staff premises to the database.
	 *
	 * @param medicalNurseStaffPremisesId the primary key for the new medical nurse staff premises
	 * @return the new medical nurse staff premises
	 */
	public static MedicalNurseStaffPremises create(
		long medicalNurseStaffPremisesId) {

		return getPersistence().create(medicalNurseStaffPremisesId);
	}

	/**
	 * Removes the medical nurse staff premises with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	public static MedicalNurseStaffPremises remove(
			long medicalNurseStaffPremisesId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalNurseStaffPremisesException {

		return getPersistence().remove(medicalNurseStaffPremisesId);
	}

	public static MedicalNurseStaffPremises updateImpl(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return getPersistence().updateImpl(medicalNurseStaffPremises);
	}

	/**
	 * Returns the medical nurse staff premises with the primary key or throws a <code>NoSuchMedicalNurseStaffPremisesException</code> if it could not be found.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises
	 * @throws NoSuchMedicalNurseStaffPremisesException if a medical nurse staff premises with the primary key could not be found
	 */
	public static MedicalNurseStaffPremises findByPrimaryKey(
			long medicalNurseStaffPremisesId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalNurseStaffPremisesException {

		return getPersistence().findByPrimaryKey(medicalNurseStaffPremisesId);
	}

	/**
	 * Returns the medical nurse staff premises with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises, or <code>null</code> if a medical nurse staff premises with the primary key could not be found
	 */
	public static MedicalNurseStaffPremises fetchByPrimaryKey(
		long medicalNurseStaffPremisesId) {

		return getPersistence().fetchByPrimaryKey(medicalNurseStaffPremisesId);
	}

	/**
	 * Returns all the medical nurse staff premiseses.
	 *
	 * @return the medical nurse staff premiseses
	 */
	public static List<MedicalNurseStaffPremises> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<MedicalNurseStaffPremises> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<MedicalNurseStaffPremises> findAll(
		int start, int end,
		OrderByComparator<MedicalNurseStaffPremises> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<MedicalNurseStaffPremises> findAll(
		int start, int end,
		OrderByComparator<MedicalNurseStaffPremises> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical nurse staff premiseses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical nurse staff premiseses.
	 *
	 * @return the number of medical nurse staff premiseses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalNurseStaffPremisesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalNurseStaffPremisesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalNurseStaffPremisesPersistence _persistence;

}