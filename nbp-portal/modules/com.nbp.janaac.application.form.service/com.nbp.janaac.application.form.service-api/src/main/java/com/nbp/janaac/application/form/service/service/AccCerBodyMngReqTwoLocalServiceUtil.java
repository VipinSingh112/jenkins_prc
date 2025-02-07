/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccCerBodyMngReqTwo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccCerBodyMngReqTwo. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccCerBodyMngReqTwoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyMngReqTwoLocalService
 * @generated
 */
public class AccCerBodyMngReqTwoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccCerBodyMngReqTwoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc cer body mng req two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwo the acc cer body mng req two
	 * @return the acc cer body mng req two that was added
	 */
	public static AccCerBodyMngReqTwo addAccCerBodyMngReqTwo(
		AccCerBodyMngReqTwo accCerBodyMngReqTwo) {

		return getService().addAccCerBodyMngReqTwo(accCerBodyMngReqTwo);
	}

	/**
	 * Creates a new acc cer body mng req two with the primary key. Does not add the acc cer body mng req two to the database.
	 *
	 * @param accCerBodyMngReqTwoId the primary key for the new acc cer body mng req two
	 * @return the new acc cer body mng req two
	 */
	public static AccCerBodyMngReqTwo createAccCerBodyMngReqTwo(
		long accCerBodyMngReqTwoId) {

		return getService().createAccCerBodyMngReqTwo(accCerBodyMngReqTwoId);
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
	 * Deletes the acc cer body mng req two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwo the acc cer body mng req two
	 * @return the acc cer body mng req two that was removed
	 */
	public static AccCerBodyMngReqTwo deleteAccCerBodyMngReqTwo(
		AccCerBodyMngReqTwo accCerBodyMngReqTwo) {

		return getService().deleteAccCerBodyMngReqTwo(accCerBodyMngReqTwo);
	}

	/**
	 * Deletes the acc cer body mng req two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the acc cer body mng req two
	 * @return the acc cer body mng req two that was removed
	 * @throws PortalException if a acc cer body mng req two with the primary key could not be found
	 */
	public static AccCerBodyMngReqTwo deleteAccCerBodyMngReqTwo(
			long accCerBodyMngReqTwoId)
		throws PortalException {

		return getService().deleteAccCerBodyMngReqTwo(accCerBodyMngReqTwoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoModelImpl</code>.
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

	public static AccCerBodyMngReqTwo fetchAccCerBodyMngReqTwo(
		long accCerBodyMngReqTwoId) {

		return getService().fetchAccCerBodyMngReqTwo(accCerBodyMngReqTwoId);
	}

	/**
	 * Returns the acc cer body mng req two matching the UUID and group.
	 *
	 * @param uuid the acc cer body mng req two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body mng req two, or <code>null</code> if a matching acc cer body mng req two could not be found
	 */
	public static AccCerBodyMngReqTwo fetchAccCerBodyMngReqTwoByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAccCerBodyMngReqTwoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc cer body mng req two with the primary key.
	 *
	 * @param accCerBodyMngReqTwoId the primary key of the acc cer body mng req two
	 * @return the acc cer body mng req two
	 * @throws PortalException if a acc cer body mng req two with the primary key could not be found
	 */
	public static AccCerBodyMngReqTwo getAccCerBodyMngReqTwo(
			long accCerBodyMngReqTwoId)
		throws PortalException {

		return getService().getAccCerBodyMngReqTwo(accCerBodyMngReqTwoId);
	}

	/**
	 * Returns the acc cer body mng req two matching the UUID and group.
	 *
	 * @param uuid the acc cer body mng req two's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body mng req two
	 * @throws PortalException if a matching acc cer body mng req two could not be found
	 */
	public static AccCerBodyMngReqTwo getAccCerBodyMngReqTwoByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAccCerBodyMngReqTwoByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body mng req twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyMngReqTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @return the range of acc cer body mng req twos
	 */
	public static List<AccCerBodyMngReqTwo> getAccCerBodyMngReqTwos(
		int start, int end) {

		return getService().getAccCerBodyMngReqTwos(start, end);
	}

	/**
	 * Returns all the acc cer body mng req twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body mng req twos
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body mng req twos, or an empty list if no matches were found
	 */
	public static List<AccCerBodyMngReqTwo>
		getAccCerBodyMngReqTwosByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAccCerBodyMngReqTwosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body mng req twos matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body mng req twos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body mng req twos
	 * @param end the upper bound of the range of acc cer body mng req twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body mng req twos, or an empty list if no matches were found
	 */
	public static List<AccCerBodyMngReqTwo>
		getAccCerBodyMngReqTwosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccCerBodyMngReqTwo> orderByComparator) {

		return getService().getAccCerBodyMngReqTwosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body mng req twos.
	 *
	 * @return the number of acc cer body mng req twos
	 */
	public static int getAccCerBodyMngReqTwosCount() {
		return getService().getAccCerBodyMngReqTwosCount();
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

	public static AccCerBodyMngReqTwo getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyMngReqTwoException {

		return getService().getJANAAC_ByApplicationId(janaacApplicationId);
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
	 * Updates the acc cer body mng req two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyMngReqTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyMngReqTwo the acc cer body mng req two
	 * @return the acc cer body mng req two that was updated
	 */
	public static AccCerBodyMngReqTwo updateAccCerBodyMngReqTwo(
		AccCerBodyMngReqTwo accCerBodyMngReqTwo) {

		return getService().updateAccCerBodyMngReqTwo(accCerBodyMngReqTwo);
	}

	public static AccCerBodyMngReqTwoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccCerBodyMngReqTwoLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccCerBodyMngReqTwoLocalServiceUtil.class,
			AccCerBodyMngReqTwoLocalService.class);

}