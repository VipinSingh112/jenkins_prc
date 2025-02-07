/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.DetailOfApplicant;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DetailOfApplicant. This utility wraps
 * <code>com.nbp.osi.application.form.services.service.impl.DetailOfApplicantLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfApplicantLocalService
 * @generated
 */
public class DetailOfApplicantLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.application.form.services.service.impl.DetailOfApplicantLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the detail of applicant to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicant the detail of applicant
	 * @return the detail of applicant that was added
	 */
	public static DetailOfApplicant addDetailOfApplicant(
		DetailOfApplicant detailOfApplicant) {

		return getService().addDetailOfApplicant(detailOfApplicant);
	}

	/**
	 * Creates a new detail of applicant with the primary key. Does not add the detail of applicant to the database.
	 *
	 * @param detailOfApplicantId the primary key for the new detail of applicant
	 * @return the new detail of applicant
	 */
	public static DetailOfApplicant createDetailOfApplicant(
		long detailOfApplicantId) {

		return getService().createDetailOfApplicant(detailOfApplicantId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void delete_OSI_DOA_OAI(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		getService().delete_OSI_DOA_OAI(osiApplicationId);
	}

	/**
	 * Deletes the detail of applicant from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicant the detail of applicant
	 * @return the detail of applicant that was removed
	 */
	public static DetailOfApplicant deleteDetailOfApplicant(
		DetailOfApplicant detailOfApplicant) {

		return getService().deleteDetailOfApplicant(detailOfApplicant);
	}

	/**
	 * Deletes the detail of applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant that was removed
	 * @throws PortalException if a detail of applicant with the primary key could not be found
	 */
	public static DetailOfApplicant deleteDetailOfApplicant(
			long detailOfApplicantId)
		throws PortalException {

		return getService().deleteDetailOfApplicant(detailOfApplicantId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl</code>.
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

	public static DetailOfApplicant fetchDetailOfApplicant(
		long detailOfApplicantId) {

		return getService().fetchDetailOfApplicant(detailOfApplicantId);
	}

	/**
	 * Returns the detail of applicant matching the UUID and group.
	 *
	 * @param uuid the detail of applicant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching detail of applicant, or <code>null</code> if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant fetchDetailOfApplicantByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDetailOfApplicantByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the detail of applicant with the primary key.
	 *
	 * @param detailOfApplicantId the primary key of the detail of applicant
	 * @return the detail of applicant
	 * @throws PortalException if a detail of applicant with the primary key could not be found
	 */
	public static DetailOfApplicant getDetailOfApplicant(
			long detailOfApplicantId)
		throws PortalException {

		return getService().getDetailOfApplicant(detailOfApplicantId);
	}

	/**
	 * Returns the detail of applicant matching the UUID and group.
	 *
	 * @param uuid the detail of applicant's UUID
	 * @param groupId the primary key of the group
	 * @return the matching detail of applicant
	 * @throws PortalException if a matching detail of applicant could not be found
	 */
	public static DetailOfApplicant getDetailOfApplicantByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getDetailOfApplicantByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the detail of applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.DetailOfApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @return the range of detail of applicants
	 */
	public static List<DetailOfApplicant> getDetailOfApplicants(
		int start, int end) {

		return getService().getDetailOfApplicants(start, end);
	}

	/**
	 * Returns all the detail of applicants matching the UUID and company.
	 *
	 * @param uuid the UUID of the detail of applicants
	 * @param companyId the primary key of the company
	 * @return the matching detail of applicants, or an empty list if no matches were found
	 */
	public static List<DetailOfApplicant>
		getDetailOfApplicantsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getDetailOfApplicantsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of detail of applicants matching the UUID and company.
	 *
	 * @param uuid the UUID of the detail of applicants
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of detail of applicants
	 * @param end the upper bound of the range of detail of applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching detail of applicants, or an empty list if no matches were found
	 */
	public static List<DetailOfApplicant>
		getDetailOfApplicantsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<DetailOfApplicant> orderByComparator) {

		return getService().getDetailOfApplicantsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of detail of applicants.
	 *
	 * @return the number of detail of applicants
	 */
	public static int getDetailOfApplicantsCount() {
		return getService().getDetailOfApplicantsCount();
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

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DetailOfApplicant getOsiById(long applicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchDetailOfApplicantException {

		return getService().getOsiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the detail of applicant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DetailOfApplicantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param detailOfApplicant the detail of applicant
	 * @return the detail of applicant that was updated
	 */
	public static DetailOfApplicant updateDetailOfApplicant(
		DetailOfApplicant detailOfApplicant) {

		return getService().updateDetailOfApplicant(detailOfApplicant);
	}

	public static DetailOfApplicantLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<DetailOfApplicantLocalService>
		_serviceSnapshot = new Snapshot<>(
			DetailOfApplicantLocalServiceUtil.class,
			DetailOfApplicantLocalService.class);

}