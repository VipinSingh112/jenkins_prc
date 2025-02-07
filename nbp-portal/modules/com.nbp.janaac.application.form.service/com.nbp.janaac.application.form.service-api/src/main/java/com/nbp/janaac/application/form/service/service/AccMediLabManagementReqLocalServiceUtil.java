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

import com.nbp.janaac.application.form.service.model.AccMediLabManagementReq;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccMediLabManagementReq. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabManagementReqLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabManagementReqLocalService
 * @generated
 */
public class AccMediLabManagementReqLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccMediLabManagementReqLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc medi lab management req to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReq the acc medi lab management req
	 * @return the acc medi lab management req that was added
	 */
	public static AccMediLabManagementReq addAccMediLabManagementReq(
		AccMediLabManagementReq accMediLabManagementReq) {

		return getService().addAccMediLabManagementReq(accMediLabManagementReq);
	}

	/**
	 * Creates a new acc medi lab management req with the primary key. Does not add the acc medi lab management req to the database.
	 *
	 * @param accMediLabManagementReqId the primary key for the new acc medi lab management req
	 * @return the new acc medi lab management req
	 */
	public static AccMediLabManagementReq createAccMediLabManagementReq(
		long accMediLabManagementReqId) {

		return getService().createAccMediLabManagementReq(
			accMediLabManagementReqId);
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
	 * Deletes the acc medi lab management req from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReq the acc medi lab management req
	 * @return the acc medi lab management req that was removed
	 */
	public static AccMediLabManagementReq deleteAccMediLabManagementReq(
		AccMediLabManagementReq accMediLabManagementReq) {

		return getService().deleteAccMediLabManagementReq(
			accMediLabManagementReq);
	}

	/**
	 * Deletes the acc medi lab management req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReqId the primary key of the acc medi lab management req
	 * @return the acc medi lab management req that was removed
	 * @throws PortalException if a acc medi lab management req with the primary key could not be found
	 */
	public static AccMediLabManagementReq deleteAccMediLabManagementReq(
			long accMediLabManagementReqId)
		throws PortalException {

		return getService().deleteAccMediLabManagementReq(
			accMediLabManagementReqId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqModelImpl</code>.
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

	public static AccMediLabManagementReq fetchAccMediLabManagementReq(
		long accMediLabManagementReqId) {

		return getService().fetchAccMediLabManagementReq(
			accMediLabManagementReqId);
	}

	/**
	 * Returns the acc medi lab management req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab management req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq
		fetchAccMediLabManagementReqByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchAccMediLabManagementReqByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc medi lab management req with the primary key.
	 *
	 * @param accMediLabManagementReqId the primary key of the acc medi lab management req
	 * @return the acc medi lab management req
	 * @throws PortalException if a acc medi lab management req with the primary key could not be found
	 */
	public static AccMediLabManagementReq getAccMediLabManagementReq(
			long accMediLabManagementReqId)
		throws PortalException {

		return getService().getAccMediLabManagementReq(
			accMediLabManagementReqId);
	}

	/**
	 * Returns the acc medi lab management req matching the UUID and group.
	 *
	 * @param uuid the acc medi lab management req's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc medi lab management req
	 * @throws PortalException if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq
			getAccMediLabManagementReqByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getAccMediLabManagementReqByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc medi lab management reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @return the range of acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> getAccMediLabManagementReqs(
		int start, int end) {

		return getService().getAccMediLabManagementReqs(start, end);
	}

	/**
	 * Returns all the acc medi lab management reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab management reqs
	 * @param companyId the primary key of the company
	 * @return the matching acc medi lab management reqs, or an empty list if no matches were found
	 */
	public static List<AccMediLabManagementReq>
		getAccMediLabManagementReqsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getAccMediLabManagementReqsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc medi lab management reqs matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc medi lab management reqs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc medi lab management reqs, or an empty list if no matches were found
	 */
	public static List<AccMediLabManagementReq>
		getAccMediLabManagementReqsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getService().getAccMediLabManagementReqsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc medi lab management reqs.
	 *
	 * @return the number of acc medi lab management reqs
	 */
	public static int getAccMediLabManagementReqsCount() {
		return getService().getAccMediLabManagementReqsCount();
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

	public static AccMediLabManagementReq getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

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
	 * Updates the acc medi lab management req in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccMediLabManagementReqLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accMediLabManagementReq the acc medi lab management req
	 * @return the acc medi lab management req that was updated
	 */
	public static AccMediLabManagementReq updateAccMediLabManagementReq(
		AccMediLabManagementReq accMediLabManagementReq) {

		return getService().updateAccMediLabManagementReq(
			accMediLabManagementReq);
	}

	public static AccMediLabManagementReqLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccMediLabManagementReqLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccMediLabManagementReqLocalServiceUtil.class,
			AccMediLabManagementReqLocalService.class);

}