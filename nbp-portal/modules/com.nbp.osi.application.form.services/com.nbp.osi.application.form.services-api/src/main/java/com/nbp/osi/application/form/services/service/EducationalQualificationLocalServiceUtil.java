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

import com.nbp.osi.application.form.services.model.EducationalQualification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for EducationalQualification. This utility wraps
 * <code>com.nbp.osi.application.form.services.service.impl.EducationalQualificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see EducationalQualificationLocalService
 * @generated
 */
public class EducationalQualificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.application.form.services.service.impl.EducationalQualificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the educational qualification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalQualification the educational qualification
	 * @return the educational qualification that was added
	 */
	public static EducationalQualification addEducationalQualification(
		EducationalQualification educationalQualification) {

		return getService().addEducationalQualification(
			educationalQualification);
	}

	/**
	 * Creates a new educational qualification with the primary key. Does not add the educational qualification to the database.
	 *
	 * @param educationalDetailId the primary key for the new educational qualification
	 * @return the new educational qualification
	 */
	public static EducationalQualification createEducationalQualification(
		long educationalDetailId) {

		return getService().createEducationalQualification(educationalDetailId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void delete_OSI_EQ_OAI(long osiApplicationId) {
		getService().delete_OSI_EQ_OAI(osiApplicationId);
	}

	/**
	 * Deletes the educational qualification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalQualification the educational qualification
	 * @return the educational qualification that was removed
	 */
	public static EducationalQualification deleteEducationalQualification(
		EducationalQualification educationalQualification) {

		return getService().deleteEducationalQualification(
			educationalQualification);
	}

	/**
	 * Deletes the educational qualification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification that was removed
	 * @throws PortalException if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification deleteEducationalQualification(
			long educationalDetailId)
		throws PortalException {

		return getService().deleteEducationalQualification(educationalDetailId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.EducationalQualificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.EducationalQualificationModelImpl</code>.
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

	public static EducationalQualification fetchEducationalQualification(
		long educationalDetailId) {

		return getService().fetchEducationalQualification(educationalDetailId);
	}

	/**
	 * Returns the educational qualification matching the UUID and group.
	 *
	 * @param uuid the educational qualification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching educational qualification, or <code>null</code> if a matching educational qualification could not be found
	 */
	public static EducationalQualification
		fetchEducationalQualificationByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchEducationalQualificationByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the educational qualification with the primary key.
	 *
	 * @param educationalDetailId the primary key of the educational qualification
	 * @return the educational qualification
	 * @throws PortalException if a educational qualification with the primary key could not be found
	 */
	public static EducationalQualification getEducationalQualification(
			long educationalDetailId)
		throws PortalException {

		return getService().getEducationalQualification(educationalDetailId);
	}

	/**
	 * Returns the educational qualification matching the UUID and group.
	 *
	 * @param uuid the educational qualification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching educational qualification
	 * @throws PortalException if a matching educational qualification could not be found
	 */
	public static EducationalQualification
			getEducationalQualificationByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getEducationalQualificationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the educational qualifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.EducationalQualificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @return the range of educational qualifications
	 */
	public static List<EducationalQualification> getEducationalQualifications(
		int start, int end) {

		return getService().getEducationalQualifications(start, end);
	}

	/**
	 * Returns all the educational qualifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the educational qualifications
	 * @param companyId the primary key of the company
	 * @return the matching educational qualifications, or an empty list if no matches were found
	 */
	public static List<EducationalQualification>
		getEducationalQualificationsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getEducationalQualificationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of educational qualifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the educational qualifications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of educational qualifications
	 * @param end the upper bound of the range of educational qualifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching educational qualifications, or an empty list if no matches were found
	 */
	public static List<EducationalQualification>
		getEducationalQualificationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<EducationalQualification> orderByComparator) {

		return getService().getEducationalQualificationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of educational qualifications.
	 *
	 * @return the number of educational qualifications
	 */
	public static int getEducationalQualificationsCount() {
		return getService().getEducationalQualificationsCount();
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

	public static List<EducationalQualification> getosiById(
		long applicationId) {

		return getService().getosiById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the educational qualification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EducationalQualificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param educationalQualification the educational qualification
	 * @return the educational qualification that was updated
	 */
	public static EducationalQualification updateEducationalQualification(
		EducationalQualification educationalQualification) {

		return getService().updateEducationalQualification(
			educationalQualification);
	}

	public static EducationalQualificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<EducationalQualificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			EducationalQualificationLocalServiceUtil.class,
			EducationalQualificationLocalService.class);

}