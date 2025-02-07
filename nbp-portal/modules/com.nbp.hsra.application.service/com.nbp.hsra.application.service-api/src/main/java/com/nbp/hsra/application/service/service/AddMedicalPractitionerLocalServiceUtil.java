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

import com.nbp.hsra.application.service.model.AddMedicalPractitioner;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AddMedicalPractitioner. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.AddMedicalPractitionerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddMedicalPractitionerLocalService
 * @generated
 */
public class AddMedicalPractitionerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.AddMedicalPractitionerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the add medical practitioner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 * @return the add medical practitioner that was added
	 */
	public static AddMedicalPractitioner addAddMedicalPractitioner(
		AddMedicalPractitioner addMedicalPractitioner) {

		return getService().addAddMedicalPractitioner(addMedicalPractitioner);
	}

	/**
	 * Creates a new add medical practitioner with the primary key. Does not add the add medical practitioner to the database.
	 *
	 * @param addMedicalPractitionerId the primary key for the new add medical practitioner
	 * @return the new add medical practitioner
	 */
	public static AddMedicalPractitioner createAddMedicalPractitioner(
		long addMedicalPractitionerId) {

		return getService().createAddMedicalPractitioner(
			addMedicalPractitionerId);
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
	 * Deletes the add medical practitioner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 * @return the add medical practitioner that was removed
	 */
	public static AddMedicalPractitioner deleteAddMedicalPractitioner(
		AddMedicalPractitioner addMedicalPractitioner) {

		return getService().deleteAddMedicalPractitioner(
			addMedicalPractitioner);
	}

	/**
	 * Deletes the add medical practitioner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner that was removed
	 * @throws PortalException if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner deleteAddMedicalPractitioner(
			long addMedicalPractitionerId)
		throws PortalException {

		return getService().deleteAddMedicalPractitioner(
			addMedicalPractitionerId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl</code>.
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

	public static AddMedicalPractitioner fetchAddMedicalPractitioner(
		long addMedicalPractitionerId) {

		return getService().fetchAddMedicalPractitioner(
			addMedicalPractitionerId);
	}

	/**
	 * Returns the add medical practitioner matching the UUID and group.
	 *
	 * @param uuid the add medical practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add medical practitioner, or <code>null</code> if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner
		fetchAddMedicalPractitionerByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchAddMedicalPractitionerByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the add medical practitioner with the primary key.
	 *
	 * @param addMedicalPractitionerId the primary key of the add medical practitioner
	 * @return the add medical practitioner
	 * @throws PortalException if a add medical practitioner with the primary key could not be found
	 */
	public static AddMedicalPractitioner getAddMedicalPractitioner(
			long addMedicalPractitionerId)
		throws PortalException {

		return getService().getAddMedicalPractitioner(addMedicalPractitionerId);
	}

	/**
	 * Returns the add medical practitioner matching the UUID and group.
	 *
	 * @param uuid the add medical practitioner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching add medical practitioner
	 * @throws PortalException if a matching add medical practitioner could not be found
	 */
	public static AddMedicalPractitioner
			getAddMedicalPractitionerByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getAddMedicalPractitionerByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the add medical practitioners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AddMedicalPractitionerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @return the range of add medical practitioners
	 */
	public static List<AddMedicalPractitioner> getAddMedicalPractitioners(
		int start, int end) {

		return getService().getAddMedicalPractitioners(start, end);
	}

	/**
	 * Returns all the add medical practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add medical practitioners
	 * @param companyId the primary key of the company
	 * @return the matching add medical practitioners, or an empty list if no matches were found
	 */
	public static List<AddMedicalPractitioner>
		getAddMedicalPractitionersByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAddMedicalPractitionersByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of add medical practitioners matching the UUID and company.
	 *
	 * @param uuid the UUID of the add medical practitioners
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of add medical practitioners
	 * @param end the upper bound of the range of add medical practitioners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching add medical practitioners, or an empty list if no matches were found
	 */
	public static List<AddMedicalPractitioner>
		getAddMedicalPractitionersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AddMedicalPractitioner> orderByComparator) {

		return getService().getAddMedicalPractitionersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of add medical practitioners.
	 *
	 * @return the number of add medical practitioners
	 */
	public static int getAddMedicalPractitionersCount() {
		return getService().getAddMedicalPractitionersCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static List<AddMedicalPractitioner> getHsraById(
		long hsraApplicationId) {

		return getService().getHsraById(hsraApplicationId);
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
	 * Updates the add medical practitioner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddMedicalPractitionerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addMedicalPractitioner the add medical practitioner
	 * @return the add medical practitioner that was updated
	 */
	public static AddMedicalPractitioner updateAddMedicalPractitioner(
		AddMedicalPractitioner addMedicalPractitioner) {

		return getService().updateAddMedicalPractitioner(
			addMedicalPractitioner);
	}

	public static AddMedicalPractitionerLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AddMedicalPractitionerLocalService>
		_serviceSnapshot = new Snapshot<>(
			AddMedicalPractitionerLocalServiceUtil.class,
			AddMedicalPractitionerLocalService.class);

}