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

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeTwo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalFacilitiesHomeTwo. This utility wraps
 * <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeTwoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeTwoLocalService
 * @generated
 */
public class MedicalFacilitiesHomeTwoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesHomeTwoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical facilities home two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was added
	 */
	public static MedicalFacilitiesHomeTwo addMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return getService().addMedicalFacilitiesHomeTwo(
			medicalFacilitiesHomeTwo);
	}

	/**
	 * Creates a new medical facilities home two with the primary key. Does not add the medical facilities home two to the database.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key for the new medical facilities home two
	 * @return the new medical facilities home two
	 */
	public static MedicalFacilitiesHomeTwo createMedicalFacilitiesHomeTwo(
		long medicalFacilitiesHomeTwoId) {

		return getService().createMedicalFacilitiesHomeTwo(
			medicalFacilitiesHomeTwoId);
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
	 * Deletes the medical facilities home two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two that was removed
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId)
		throws PortalException {

		return getService().deleteMedicalFacilitiesHomeTwo(
			medicalFacilitiesHomeTwoId);
	}

	/**
	 * Deletes the medical facilities home two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was removed
	 */
	public static MedicalFacilitiesHomeTwo deleteMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return getService().deleteMedicalFacilitiesHomeTwo(
			medicalFacilitiesHomeTwo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
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

	public static MedicalFacilitiesHomeTwo fetchMedicalFacilitiesHomeTwo(
		long medicalFacilitiesHomeTwoId) {

		return getService().fetchMedicalFacilitiesHomeTwo(
			medicalFacilitiesHomeTwoId);
	}

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two, or <code>null</code> if a matching medical facilities home two could not be found
	 */
	public static MedicalFacilitiesHomeTwo
		fetchMedicalFacilitiesHomeTwoByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchMedicalFacilitiesHomeTwoByUuidAndGroupId(
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

	public static List<MedicalFacilitiesHomeTwo>
		getMedicalFacilitiesAppliInfoBy_Id(long applicationId) {

		return getService().getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities home two with the primary key.
	 *
	 * @param medicalFacilitiesHomeTwoId the primary key of the medical facilities home two
	 * @return the medical facilities home two
	 * @throws PortalException if a medical facilities home two with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeTwo getMedicalFacilitiesHomeTwo(
			long medicalFacilitiesHomeTwoId)
		throws PortalException {

		return getService().getMedicalFacilitiesHomeTwo(
			medicalFacilitiesHomeTwoId);
	}

	/**
	 * Returns the medical facilities home two matching the UUID and group.
	 *
	 * @param uuid the medical facilities home two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home two
	 * @throws PortalException if a matching medical facilities home two could not be found
	 */
	public static MedicalFacilitiesHomeTwo
			getMedicalFacilitiesHomeTwoByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getMedicalFacilitiesHomeTwoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities home twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @return the range of medical facilities home twos
	 */
	public static List<MedicalFacilitiesHomeTwo> getMedicalFacilitiesHomeTwos(
		int start, int end) {

		return getService().getMedicalFacilitiesHomeTwos(start, end);
	}

	/**
	 * Returns all the medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities home twos, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesHomeTwo>
		getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities home twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home twos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities home twos
	 * @param end the upper bound of the range of medical facilities home twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities home twos, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesHomeTwo>
		getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesHomeTwo> orderByComparator) {

		return getService().getMedicalFacilitiesHomeTwosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities home twos.
	 *
	 * @return the number of medical facilities home twos
	 */
	public static int getMedicalFacilitiesHomeTwosCount() {
		return getService().getMedicalFacilitiesHomeTwosCount();
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
	 * Updates the medical facilities home two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeTwo the medical facilities home two
	 * @return the medical facilities home two that was updated
	 */
	public static MedicalFacilitiesHomeTwo updateMedicalFacilitiesHomeTwo(
		MedicalFacilitiesHomeTwo medicalFacilitiesHomeTwo) {

		return getService().updateMedicalFacilitiesHomeTwo(
			medicalFacilitiesHomeTwo);
	}

	public static MedicalFacilitiesHomeTwoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalFacilitiesHomeTwoLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalFacilitiesHomeTwoLocalServiceUtil.class,
			MedicalFacilitiesHomeTwoLocalService.class);

}