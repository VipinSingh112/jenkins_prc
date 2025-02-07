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

import com.nbp.janaac.application.form.service.model.AccCerBodyProdScope;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AccCerBodyProdScope. This utility wraps
 * <code>com.nbp.janaac.application.form.service.service.impl.AccCerBodyProdScopeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyProdScopeLocalService
 * @generated
 */
public class AccCerBodyProdScopeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.application.form.service.service.impl.AccCerBodyProdScopeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acc cer body prod scope to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyProdScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyProdScope the acc cer body prod scope
	 * @return the acc cer body prod scope that was added
	 */
	public static AccCerBodyProdScope addAccCerBodyProdScope(
		AccCerBodyProdScope accCerBodyProdScope) {

		return getService().addAccCerBodyProdScope(accCerBodyProdScope);
	}

	/**
	 * Creates a new acc cer body prod scope with the primary key. Does not add the acc cer body prod scope to the database.
	 *
	 * @param accCerBodyProdScopeId the primary key for the new acc cer body prod scope
	 * @return the new acc cer body prod scope
	 */
	public static AccCerBodyProdScope createAccCerBodyProdScope(
		long accCerBodyProdScopeId) {

		return getService().createAccCerBodyProdScope(accCerBodyProdScopeId);
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
	 * Deletes the acc cer body prod scope from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyProdScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyProdScope the acc cer body prod scope
	 * @return the acc cer body prod scope that was removed
	 */
	public static AccCerBodyProdScope deleteAccCerBodyProdScope(
		AccCerBodyProdScope accCerBodyProdScope) {

		return getService().deleteAccCerBodyProdScope(accCerBodyProdScope);
	}

	/**
	 * Deletes the acc cer body prod scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyProdScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyProdScopeId the primary key of the acc cer body prod scope
	 * @return the acc cer body prod scope that was removed
	 * @throws PortalException if a acc cer body prod scope with the primary key could not be found
	 */
	public static AccCerBodyProdScope deleteAccCerBodyProdScope(
			long accCerBodyProdScopeId)
		throws PortalException {

		return getService().deleteAccCerBodyProdScope(accCerBodyProdScopeId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyProdScopeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyProdScopeModelImpl</code>.
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

	public static AccCerBodyProdScope fetchAccCerBodyProdScope(
		long accCerBodyProdScopeId) {

		return getService().fetchAccCerBodyProdScope(accCerBodyProdScopeId);
	}

	/**
	 * Returns the acc cer body prod scope matching the UUID and group.
	 *
	 * @param uuid the acc cer body prod scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body prod scope, or <code>null</code> if a matching acc cer body prod scope could not be found
	 */
	public static AccCerBodyProdScope fetchAccCerBodyProdScopeByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchAccCerBodyProdScopeByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns the acc cer body prod scope with the primary key.
	 *
	 * @param accCerBodyProdScopeId the primary key of the acc cer body prod scope
	 * @return the acc cer body prod scope
	 * @throws PortalException if a acc cer body prod scope with the primary key could not be found
	 */
	public static AccCerBodyProdScope getAccCerBodyProdScope(
			long accCerBodyProdScopeId)
		throws PortalException {

		return getService().getAccCerBodyProdScope(accCerBodyProdScopeId);
	}

	/**
	 * Returns the acc cer body prod scope matching the UUID and group.
	 *
	 * @param uuid the acc cer body prod scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body prod scope
	 * @throws PortalException if a matching acc cer body prod scope could not be found
	 */
	public static AccCerBodyProdScope getAccCerBodyProdScopeByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getAccCerBodyProdScopeByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body prod scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyProdScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @return the range of acc cer body prod scopes
	 */
	public static List<AccCerBodyProdScope> getAccCerBodyProdScopes(
		int start, int end) {

		return getService().getAccCerBodyProdScopes(start, end);
	}

	/**
	 * Returns all the acc cer body prod scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body prod scopes
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body prod scopes, or an empty list if no matches were found
	 */
	public static List<AccCerBodyProdScope>
		getAccCerBodyProdScopesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getAccCerBodyProdScopesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body prod scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body prod scopes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body prod scopes
	 * @param end the upper bound of the range of acc cer body prod scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body prod scopes, or an empty list if no matches were found
	 */
	public static List<AccCerBodyProdScope>
		getAccCerBodyProdScopesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<AccCerBodyProdScope> orderByComparator) {

		return getService().getAccCerBodyProdScopesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body prod scopes.
	 *
	 * @return the number of acc cer body prod scopes
	 */
	public static int getAccCerBodyProdScopesCount() {
		return getService().getAccCerBodyProdScopesCount();
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

	public static AccCerBodyProdScope getJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyProdScopeException {

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
	 * Updates the acc cer body prod scope in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyProdScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyProdScope the acc cer body prod scope
	 * @return the acc cer body prod scope that was updated
	 */
	public static AccCerBodyProdScope updateAccCerBodyProdScope(
		AccCerBodyProdScope accCerBodyProdScope) {

		return getService().updateAccCerBodyProdScope(accCerBodyProdScope);
	}

	public static AccCerBodyProdScopeLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AccCerBodyProdScopeLocalService>
		_serviceSnapshot = new Snapshot<>(
			AccCerBodyProdScopeLocalServiceUtil.class,
			AccCerBodyProdScopeLocalService.class);

}