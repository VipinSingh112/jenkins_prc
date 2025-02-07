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

import com.nbp.janaac.application.form.service.model.AccCerBodyManageReq;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccCerBodyManageReq. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccCerBodyManageReqLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyManageReqLocalService
 * @generated
 */
public class AccCerBodyManageReqLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccCerBodyManageReqLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc cer body manage req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 * @return the acc cer body manage req that was added
	 */
	public static AccCerBodyManageReq addAccCerBodyManageReq(
		AccCerBodyManageReq accCerBodyManageReq) {

		return getService().addAccCerBodyManageReq(accCerBodyManageReq);
	}

	/**
	 * Creates a new acc cer body manage req with the primary key. Does not add the acc cer body manage req to the database.
	 *
	 * @param accCerBodyManageReqId the primary key for the new acc cer body manage req
	 * @return the new acc cer body manage req
	 */
	public static AccCerBodyManageReq createAccCerBodyManageReq(
		long accCerBodyManageReqId) {

		return getService().createAccCerBodyManageReq(accCerBodyManageReqId);
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
	 * Deletes the acc cer body manage req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 */
	public static AccCerBodyManageReq deleteAccCerBodyManageReq(
		AccCerBodyManageReq accCerBodyManageReq) {

		return getService().deleteAccCerBodyManageReq(accCerBodyManageReq);
	}

	/**
	 * Deletes the acc cer body manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 * @throws PortalException if a acc cer body manage req with the primary key could not be found
	 */
	public static AccCerBodyManageReq deleteAccCerBodyManageReq(
			long accCerBodyManageReqId)
		throws PortalException {

		return getService().deleteAccCerBodyManageReq(accCerBodyManageReqId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqModelImpl</code>.
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

	public static AccCerBodyManageReq fetchAccCerBodyManageReq(
		long accCerBodyManageReqId) {

		return getService().fetchAccCerBodyManageReq(accCerBodyManageReqId);
	}

	/**
	 * Returns the acc cer body manage req matching the UUID and group.
	 *
	 * @param uuid the acc cer body manage req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchAccCerBodyManageReqByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAccCerBodyManageReqByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc cer body manage req with the primary key.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req
	 * @throws PortalException if a acc cer body manage req with the primary key could not be found
	 */
	public static AccCerBodyManageReq getAccCerBodyManageReq(
			long accCerBodyManageReqId)
		throws PortalException {

		return getService().getAccCerBodyManageReq(accCerBodyManageReqId);
	}

	/**
	 * Returns the acc cer body manage req matching the UUID and group.
	 *
	 * @param uuid the acc cer body manage req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body manage req
	 * @throws PortalException if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq getAccCerBodyManageReqByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAccCerBodyManageReqByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> getAccCerBodyManageReqs(
		int start, int end) {

		return getService().getAccCerBodyManageReqs(start, end);
	}

	/**
	 * Returns all the acc cer body manage reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body manage reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body manage reqs, or an empty list if no matches were found
	 */
	public static List<AccCerBodyManageReq>
		getAccCerBodyManageReqsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAccCerBodyManageReqsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body manage reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body manage reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body manage reqs, or an empty list if no matches were found
	 */
	public static List<AccCerBodyManageReq>
		getAccCerBodyManageReqsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getService().getAccCerBodyManageReqsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body manage reqs.
	 *
	 * @return the number of acc cer body manage reqs
	 */
	public static int getAccCerBodyManageReqsCount() {
		return getService().getAccCerBodyManageReqsCount();
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

	public static AccCerBodyManageReq getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

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
	 * Updates the acc cer body manage req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyManageReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 * @return the acc cer body manage req that was updated
	 */
	public static AccCerBodyManageReq updateAccCerBodyManageReq(
		AccCerBodyManageReq accCerBodyManageReq) {

		return getService().updateAccCerBodyManageReq(accCerBodyManageReq);
	}

	public static AccCerBodyManageReqLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccCerBodyManageReqLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccCerBodyManageReqLocalServiceUtil.class,
			AccCerBodyManageReqLocalService.class);

}