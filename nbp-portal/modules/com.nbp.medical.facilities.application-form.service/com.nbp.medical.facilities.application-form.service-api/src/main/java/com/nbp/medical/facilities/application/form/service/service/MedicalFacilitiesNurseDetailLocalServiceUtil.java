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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetail;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalFacilitiesNurseDetail. This utility wraps
 * <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesNurseDetailLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetailLocalService
 * @generated
 */
public class MedicalFacilitiesNurseDetailLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesNurseDetailLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical facilities nurse detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was added
	 */
	public static MedicalFacilitiesNurseDetail addMedicalFacilitiesNurseDetail(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return getService().addMedicalFacilitiesNurseDetail(
			medicalFacilitiesNurseDetail);
	}

	/**
	 * Creates a new medical facilities nurse detail with the primary key. Does not add the medical facilities nurse detail to the database.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key for the new medical facilities nurse detail
	 * @return the new medical facilities nurse detail
	 */
	public static MedicalFacilitiesNurseDetail
		createMedicalFacilitiesNurseDetail(
			long medicalFacilitiesNurseDetailId) {

		return getService().createMedicalFacilitiesNurseDetail(
			medicalFacilitiesNurseDetailId);
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
	 * Deletes the medical facilities nurse detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 * @throws PortalException if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail
			deleteMedicalFacilitiesNurseDetail(
				long medicalFacilitiesNurseDetailId)
		throws PortalException {

		return getService().deleteMedicalFacilitiesNurseDetail(
			medicalFacilitiesNurseDetailId);
	}

	/**
	 * Deletes the medical facilities nurse detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 */
	public static MedicalFacilitiesNurseDetail
		deleteMedicalFacilitiesNurseDetail(
			MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return getService().deleteMedicalFacilitiesNurseDetail(
			medicalFacilitiesNurseDetail);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl</code>.
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

	public static MedicalFacilitiesNurseDetail
		fetchMedicalFacilitiesNurseDetail(long medicalFacilitiesNurseDetailId) {

		return getService().fetchMedicalFacilitiesNurseDetail(
			medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns the medical facilities nurse detail matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail
		fetchMedicalFacilitiesNurseDetailByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchMedicalFacilitiesNurseDetailByUuidAndGroupId(
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

	public static List<MedicalFacilitiesNurseDetail>
		getMedicalFacilitiesAppliInfoBy_Id(long applicationId) {

		return getService().getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities nurse detail with the primary key.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail
	 * @throws PortalException if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail getMedicalFacilitiesNurseDetail(
			long medicalFacilitiesNurseDetailId)
		throws PortalException {

		return getService().getMedicalFacilitiesNurseDetail(
			medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns the medical facilities nurse detail matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse detail
	 * @throws PortalException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail
			getMedicalFacilitiesNurseDetailByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getMedicalFacilitiesNurseDetailByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail>
		getMedicalFacilitiesNurseDetails(int start, int end) {

		return getService().getMedicalFacilitiesNurseDetails(start, end);
	}

	/**
	 * Returns all the medical facilities nurse details matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse details
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities nurse details, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesNurseDetail>
		getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities nurse details matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse details
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities nurse details, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesNurseDetail>
		getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getService().getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities nurse details.
	 *
	 * @return the number of medical facilities nurse details
	 */
	public static int getMedicalFacilitiesNurseDetailsCount() {
		return getService().getMedicalFacilitiesNurseDetailsCount();
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
	 * Updates the medical facilities nurse detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was updated
	 */
	public static MedicalFacilitiesNurseDetail
		updateMedicalFacilitiesNurseDetail(
			MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return getService().updateMedicalFacilitiesNurseDetail(
			medicalFacilitiesNurseDetail);
	}

	public static MedicalFacilitiesNurseDetailLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalFacilitiesNurseDetailLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalFacilitiesNurseDetailLocalServiceUtil.class,
			MedicalFacilitiesNurseDetailLocalService.class);

}