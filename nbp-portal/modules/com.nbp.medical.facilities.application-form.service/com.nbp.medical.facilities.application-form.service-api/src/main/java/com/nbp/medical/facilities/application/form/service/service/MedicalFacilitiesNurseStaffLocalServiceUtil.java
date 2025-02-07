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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalFacilitiesNurseStaff. This utility wraps
 * <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesNurseStaffLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseStaffLocalService
 * @generated
 */
public class MedicalFacilitiesNurseStaffLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesNurseStaffLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical facilities nurse staff to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was added
	 */
	public static MedicalFacilitiesNurseStaff addMedicalFacilitiesNurseStaff(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return getService().addMedicalFacilitiesNurseStaff(
			medicalFacilitiesNurseStaff);
	}

	/**
	 * Creates a new medical facilities nurse staff with the primary key. Does not add the medical facilities nurse staff to the database.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key for the new medical facilities nurse staff
	 * @return the new medical facilities nurse staff
	 */
	public static MedicalFacilitiesNurseStaff createMedicalFacilitiesNurseStaff(
		long medicalFacilitiesNurseStaffId) {

		return getService().createMedicalFacilitiesNurseStaff(
			medicalFacilitiesNurseStaffId);
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
	 * Deletes the medical facilities nurse staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 * @throws PortalException if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff deleteMedicalFacilitiesNurseStaff(
			long medicalFacilitiesNurseStaffId)
		throws PortalException {

		return getService().deleteMedicalFacilitiesNurseStaff(
			medicalFacilitiesNurseStaffId);
	}

	/**
	 * Deletes the medical facilities nurse staff from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 */
	public static MedicalFacilitiesNurseStaff deleteMedicalFacilitiesNurseStaff(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return getService().deleteMedicalFacilitiesNurseStaff(
			medicalFacilitiesNurseStaff);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
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

	public static MedicalFacilitiesNurseStaff fetchMedicalFacilitiesNurseStaff(
		long medicalFacilitiesNurseStaffId) {

		return getService().fetchMedicalFacilitiesNurseStaff(
			medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns the medical facilities nurse staff matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff
		fetchMedicalFacilitiesNurseStaffByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchMedicalFacilitiesNurseStaffByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<MedicalFacilitiesNurseStaff>
		getMedicalFacilitiesAppliInfoBy_Id(long applicationId) {

		return getService().getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff
	 * @throws PortalException if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff getMedicalFacilitiesNurseStaff(
			long medicalFacilitiesNurseStaffId)
		throws PortalException {

		return getService().getMedicalFacilitiesNurseStaff(
			medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns the medical facilities nurse staff matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse staff
	 * @throws PortalException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff
			getMedicalFacilitiesNurseStaffByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getMedicalFacilitiesNurseStaffByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff>
		getMedicalFacilitiesNurseStaffs(int start, int end) {

		return getService().getMedicalFacilitiesNurseStaffs(start, end);
	}

	/**
	 * Returns all the medical facilities nurse staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse staffs
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities nurse staffs, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesNurseStaff>
		getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities nurse staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse staffs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities nurse staffs, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesNurseStaff>
		getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getService().getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities nurse staffs.
	 *
	 * @return the number of medical facilities nurse staffs
	 */
	public static int getMedicalFacilitiesNurseStaffsCount() {
		return getService().getMedicalFacilitiesNurseStaffsCount();
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
	 * Updates the medical facilities nurse staff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was updated
	 */
	public static MedicalFacilitiesNurseStaff updateMedicalFacilitiesNurseStaff(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return getService().updateMedicalFacilitiesNurseStaff(
			medicalFacilitiesNurseStaff);
	}

	public static MedicalFacilitiesNurseStaffLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalFacilitiesNurseStaffLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalFacilitiesNurseStaffLocalServiceUtil.class,
			MedicalFacilitiesNurseStaffLocalService.class);

}