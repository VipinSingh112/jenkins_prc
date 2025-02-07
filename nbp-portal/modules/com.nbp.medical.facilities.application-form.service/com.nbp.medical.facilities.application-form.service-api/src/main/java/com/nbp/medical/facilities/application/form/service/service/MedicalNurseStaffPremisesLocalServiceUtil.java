/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalNurseStaffPremises;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalNurseStaffPremises. This utility wraps
 * <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalNurseStaffPremisesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalNurseStaffPremisesLocalService
 * @generated
 */
public class MedicalNurseStaffPremisesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalNurseStaffPremisesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical nurse staff premises to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 * @return the medical nurse staff premises that was added
	 */
	public static MedicalNurseStaffPremises addMedicalNurseStaffPremises(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return getService().addMedicalNurseStaffPremises(
			medicalNurseStaffPremises);
	}

	/**
	 * Creates a new medical nurse staff premises with the primary key. Does not add the medical nurse staff premises to the database.
	 *
	 * @param medicalNurseStaffPremisesId the primary key for the new medical nurse staff premises
	 * @return the new medical nurse staff premises
	 */
	public static MedicalNurseStaffPremises createMedicalNurseStaffPremises(
		long medicalNurseStaffPremisesId) {

		return getService().createMedicalNurseStaffPremises(
			medicalNurseStaffPremisesId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the medical nurse staff premises with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 * @throws PortalException if a medical nurse staff premises with the primary key could not be found
	 */
	public static MedicalNurseStaffPremises deleteMedicalNurseStaffPremises(
			long medicalNurseStaffPremisesId)
		throws PortalException {

		return getService().deleteMedicalNurseStaffPremises(
			medicalNurseStaffPremisesId);
	}

	/**
	 * Deletes the medical nurse staff premises from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 * @return the medical nurse staff premises that was removed
	 */
	public static MedicalNurseStaffPremises deleteMedicalNurseStaffPremises(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return getService().deleteMedicalNurseStaffPremises(
			medicalNurseStaffPremises);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static MedicalNurseStaffPremises fetchMedicalNurseStaffPremises(
		long medicalNurseStaffPremisesId) {

		return getService().fetchMedicalNurseStaffPremises(
			medicalNurseStaffPremisesId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static MedicalNurseStaffPremises getMedicalFacilities_ByAppId(
			long applicationId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalNurseStaffPremisesException {

		return getService().getMedicalFacilities_ByAppId(applicationId);
	}

	/**
	 * Returns the medical nurse staff premises with the primary key.
	 *
	 * @param medicalNurseStaffPremisesId the primary key of the medical nurse staff premises
	 * @return the medical nurse staff premises
	 * @throws PortalException if a medical nurse staff premises with the primary key could not be found
	 */
	public static MedicalNurseStaffPremises getMedicalNurseStaffPremises(
			long medicalNurseStaffPremisesId)
		throws PortalException {

		return getService().getMedicalNurseStaffPremises(
			medicalNurseStaffPremisesId);
	}

	/**
	 * Returns a range of all the medical nurse staff premiseses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalNurseStaffPremisesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical nurse staff premiseses
	 * @param end the upper bound of the range of medical nurse staff premiseses (not inclusive)
	 * @return the range of medical nurse staff premiseses
	 */
	public static List<MedicalNurseStaffPremises>
		getMedicalNurseStaffPremiseses(int start, int end) {

		return getService().getMedicalNurseStaffPremiseses(start, end);
	}

	/**
	 * Returns the number of medical nurse staff premiseses.
	 *
	 * @return the number of medical nurse staff premiseses
	 */
	public static int getMedicalNurseStaffPremisesesCount() {
		return getService().getMedicalNurseStaffPremisesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the medical nurse staff premises in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalNurseStaffPremisesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalNurseStaffPremises the medical nurse staff premises
	 * @return the medical nurse staff premises that was updated
	 */
	public static MedicalNurseStaffPremises updateMedicalNurseStaffPremises(
		MedicalNurseStaffPremises medicalNurseStaffPremises) {

		return getService().updateMedicalNurseStaffPremises(
			medicalNurseStaffPremises);
	}

	public static MedicalNurseStaffPremisesLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalNurseStaffPremisesLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalNurseStaffPremisesLocalServiceUtil.class,
			MedicalNurseStaffPremisesLocalService.class);

}