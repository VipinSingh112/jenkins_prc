/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccCerBodyScopeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyScopeLocalService
 * @generated
 */
public class AccCerBodyScopeLocalServiceWrapper
	implements AccCerBodyScopeLocalService,
			   ServiceWrapper<AccCerBodyScopeLocalService> {

	public AccCerBodyScopeLocalServiceWrapper() {
		this(null);
	}

	public AccCerBodyScopeLocalServiceWrapper(
		AccCerBodyScopeLocalService accCerBodyScopeLocalService) {

		_accCerBodyScopeLocalService = accCerBodyScopeLocalService;
	}

	/**
	 * Adds the acc cer body scope to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyScope the acc cer body scope
	 * @return the acc cer body scope that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
		addAccCerBodyScope(
			com.nbp.janaac.application.form.service.model.AccCerBodyScope
				accCerBodyScope) {

		return _accCerBodyScopeLocalService.addAccCerBodyScope(accCerBodyScope);
	}

	/**
	 * Creates a new acc cer body scope with the primary key. Does not add the acc cer body scope to the database.
	 *
	 * @param accCerBodyScopeId the primary key for the new acc cer body scope
	 * @return the new acc cer body scope
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
		createAccCerBodyScope(long accCerBodyScopeId) {

		return _accCerBodyScopeLocalService.createAccCerBodyScope(
			accCerBodyScopeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyScopeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the acc cer body scope from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyScope the acc cer body scope
	 * @return the acc cer body scope that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
		deleteAccCerBodyScope(
			com.nbp.janaac.application.form.service.model.AccCerBodyScope
				accCerBodyScope) {

		return _accCerBodyScopeLocalService.deleteAccCerBodyScope(
			accCerBodyScope);
	}

	/**
	 * Deletes the acc cer body scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyScopeId the primary key of the acc cer body scope
	 * @return the acc cer body scope that was removed
	 * @throws PortalException if a acc cer body scope with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
			deleteAccCerBodyScope(long accCerBodyScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyScopeLocalService.deleteAccCerBodyScope(
			accCerBodyScopeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyScopeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accCerBodyScopeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accCerBodyScopeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accCerBodyScopeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _accCerBodyScopeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _accCerBodyScopeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _accCerBodyScopeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _accCerBodyScopeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _accCerBodyScopeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
		fetchAccCerBodyScope(long accCerBodyScopeId) {

		return _accCerBodyScopeLocalService.fetchAccCerBodyScope(
			accCerBodyScopeId);
	}

	/**
	 * Returns the acc cer body scope matching the UUID and group.
	 *
	 * @param uuid the acc cer body scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body scope, or <code>null</code> if a matching acc cer body scope could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
		fetchAccCerBodyScopeByUuidAndGroupId(String uuid, long groupId) {

		return _accCerBodyScopeLocalService.
			fetchAccCerBodyScopeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc cer body scope with the primary key.
	 *
	 * @param accCerBodyScopeId the primary key of the acc cer body scope
	 * @return the acc cer body scope
	 * @throws PortalException if a acc cer body scope with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
			getAccCerBodyScope(long accCerBodyScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyScopeLocalService.getAccCerBodyScope(
			accCerBodyScopeId);
	}

	/**
	 * Returns the acc cer body scope matching the UUID and group.
	 *
	 * @param uuid the acc cer body scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc cer body scope
	 * @throws PortalException if a matching acc cer body scope could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
			getAccCerBodyScopeByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyScopeLocalService.getAccCerBodyScopeByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the acc cer body scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccCerBodyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @return the range of acc cer body scopes
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyScope>
			getAccCerBodyScopes(int start, int end) {

		return _accCerBodyScopeLocalService.getAccCerBodyScopes(start, end);
	}

	/**
	 * Returns all the acc cer body scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body scopes
	 * @param companyId the primary key of the company
	 * @return the matching acc cer body scopes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyScope>
			getAccCerBodyScopesByUuidAndCompanyId(String uuid, long companyId) {

		return _accCerBodyScopeLocalService.
			getAccCerBodyScopesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc cer body scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc cer body scopes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc cer body scopes
	 * @param end the upper bound of the range of acc cer body scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc cer body scopes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccCerBodyScope>
			getAccCerBodyScopesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccCerBodyScope> orderByComparator) {

		return _accCerBodyScopeLocalService.
			getAccCerBodyScopesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc cer body scopes.
	 *
	 * @return the number of acc cer body scopes
	 */
	@Override
	public int getAccCerBodyScopesCount() {
		return _accCerBodyScopeLocalService.getAccCerBodyScopesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accCerBodyScopeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accCerBodyScopeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accCerBodyScopeLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyScopeException {

		return _accCerBodyScopeLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accCerBodyScopeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accCerBodyScopeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acc cer body scope in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccCerBodyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accCerBodyScope the acc cer body scope
	 * @return the acc cer body scope that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccCerBodyScope
		updateAccCerBodyScope(
			com.nbp.janaac.application.form.service.model.AccCerBodyScope
				accCerBodyScope) {

		return _accCerBodyScopeLocalService.updateAccCerBodyScope(
			accCerBodyScope);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accCerBodyScopeLocalService.getBasePersistence();
	}

	@Override
	public AccCerBodyScopeLocalService getWrappedService() {
		return _accCerBodyScopeLocalService;
	}

	@Override
	public void setWrappedService(
		AccCerBodyScopeLocalService accCerBodyScopeLocalService) {

		_accCerBodyScopeLocalService = accCerBodyScopeLocalService;
	}

	private AccCerBodyScopeLocalService _accCerBodyScopeLocalService;

}