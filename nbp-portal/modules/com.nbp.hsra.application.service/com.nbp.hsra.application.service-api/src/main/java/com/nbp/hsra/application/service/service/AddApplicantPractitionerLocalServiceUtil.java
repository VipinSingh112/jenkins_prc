/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.AddApplicantPractitioner;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddApplicantPractitioner. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.AddApplicantPractitionerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddApplicantPractitionerLocalService
 * @generated
 */
public class AddApplicantPractitionerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.AddApplicantPractitionerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add applicant practitioner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 * @return the add applicant practitioner that was added
	 */
	public static AddApplicantPractitioner addAddApplicantPractitioner(
		AddApplicantPractitioner addApplicantPractitioner) {

		return getService().addAddApplicantPractitioner(
			addApplicantPractitioner);
	}

	/**
	 * Creates a new add applicant practitioner with the primary key. Does not add the add applicant practitioner to the database.
	 *
	 * @param addApplicantPractitionerId the primary key for the new add applicant practitioner
	 * @return the new add applicant practitioner
	 */
	public static AddApplicantPractitioner createAddApplicantPractitioner(
		long addApplicantPractitionerId) {

		return getService().createAddApplicantPractitioner(
			addApplicantPractitionerId);
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
	 * Deletes the add applicant practitioner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 * @return the add applicant practitioner that was removed
	 */
	public static AddApplicantPractitioner deleteAddApplicantPractitioner(
		AddApplicantPractitioner addApplicantPractitioner) {

		return getService().deleteAddApplicantPractitioner(
			addApplicantPractitioner);
	}

	/**
	 * Deletes the add applicant practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner that was removed
	 * @throws PortalException if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner deleteAddApplicantPractitioner(
			long addApplicantPractitionerId)
		throws PortalException {

		return getService().deleteAddApplicantPractitioner(
			addApplicantPractitionerId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddApplicantPractitionerModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddApplicantPractitionerModelImpl</code>.
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

	public static AddApplicantPractitioner fetchAddApplicantPractitioner(
		long addApplicantPractitionerId) {

		return getService().fetchAddApplicantPractitioner(
			addApplicantPractitionerId);
	}

	/**
	 * Returns the add applicant practitioner matching the UUID and group.
	 *
	 * @param uuid the add applicant practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add applicant practitioner, or <code>null</code> if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner
		fetchAddApplicantPractitionerByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchAddApplicantPractitionerByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add applicant practitioner with the primary key.
	 *
	 * @param addApplicantPractitionerId the primary key of the add applicant practitioner
	 * @return the add applicant practitioner
	 * @throws PortalException if a add applicant practitioner with the primary key could not be found
	 */
	public static AddApplicantPractitioner getAddApplicantPractitioner(
			long addApplicantPractitionerId)
		throws PortalException {

		return getService().getAddApplicantPractitioner(
			addApplicantPractitionerId);
	}

	/**
	 * Returns the add applicant practitioner matching the UUID and group.
	 *
	 * @param uuid the add applicant practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add applicant practitioner
	 * @throws PortalException if a matching add applicant practitioner could not be found
	 */
	public static AddApplicantPractitioner
			getAddApplicantPractitionerByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getAddApplicantPractitionerByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the add applicant practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddApplicantPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @return the range of add applicant practitioners
	 */
	public static List<AddApplicantPractitioner> getAddApplicantPractitioners(
		int start, int end) {

		return getService().getAddApplicantPractitioners(start, end);
	}

	/**
	 * Returns all the add applicant practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add applicant practitioners
	 * @param companyId the primary key of the company
	 * @return the matching add applicant practitioners, or an empty list if no matches were found
	 */
	public static List<AddApplicantPractitioner>
		getAddApplicantPractitionersByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAddApplicantPractitionersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of add applicant practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add applicant practitioners
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of add applicant practitioners
	 * @param end the upper bound of the range of add applicant practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching add applicant practitioners, or an empty list if no matches were found
	 */
	public static List<AddApplicantPractitioner>
		getAddApplicantPractitionersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AddApplicantPractitioner> orderByComparator) {

		return getService().getAddApplicantPractitionersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of add applicant practitioners.
	 *
	 * @return the number of add applicant practitioners
	 */
	public static int getAddApplicantPractitionersCount() {
		return getService().getAddApplicantPractitionersCount();
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

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add applicant practitioner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddApplicantPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addApplicantPractitioner the add applicant practitioner
	 * @return the add applicant practitioner that was updated
	 */
	public static AddApplicantPractitioner updateAddApplicantPractitioner(
		AddApplicantPractitioner addApplicantPractitioner) {

		return getService().updateAddApplicantPractitioner(
			addApplicantPractitioner);
	}

	public static AddApplicantPractitionerLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddApplicantPractitionerLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddApplicantPractitionerLocalServiceUtil.class,
			AddApplicantPractitionerLocalService.class);

}