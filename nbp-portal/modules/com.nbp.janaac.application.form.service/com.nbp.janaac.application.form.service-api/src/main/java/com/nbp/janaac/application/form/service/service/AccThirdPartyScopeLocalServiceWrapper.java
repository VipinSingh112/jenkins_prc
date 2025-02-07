/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AccThirdPartyScopeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScopeLocalService
 * @generated
 */
public class AccThirdPartyScopeLocalServiceWrapper
	implements AccThirdPartyScopeLocalService,
			   ServiceWrapper<AccThirdPartyScopeLocalService> {

	public AccThirdPartyScopeLocalServiceWrapper() {
		this(null);
	}

	public AccThirdPartyScopeLocalServiceWrapper(
		AccThirdPartyScopeLocalService accThirdPartyScopeLocalService) {

		_accThirdPartyScopeLocalService = accThirdPartyScopeLocalService;
	}

	/**
	 * Adds the acc third party scope to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyScope the acc third party scope
	 * @return the acc third party scope that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
		addAccThirdPartyScope(
			com.nbp.janaac.application.form.service.model.AccThirdPartyScope
				accThirdPartyScope) {

		return _accThirdPartyScopeLocalService.addAccThirdPartyScope(
			accThirdPartyScope);
	}

	/**
	 * Creates a new acc third party scope with the primary key. Does not add the acc third party scope to the database.
	 *
	 * @param accThirdPartyScopeId the primary key for the new acc third party scope
	 * @return the new acc third party scope
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
		createAccThirdPartyScope(long accThirdPartyScopeId) {

		return _accThirdPartyScopeLocalService.createAccThirdPartyScope(
			accThirdPartyScopeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyScopeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acc third party scope from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyScope the acc third party scope
	 * @return the acc third party scope that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
		deleteAccThirdPartyScope(
			com.nbp.janaac.application.form.service.model.AccThirdPartyScope
				accThirdPartyScope) {

		return _accThirdPartyScopeLocalService.deleteAccThirdPartyScope(
			accThirdPartyScope);
	}

	/**
	 * Deletes the acc third party scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope that was removed
	 * @throws PortalException if a acc third party scope with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
			deleteAccThirdPartyScope(long accThirdPartyScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyScopeLocalService.deleteAccThirdPartyScope(
			accThirdPartyScopeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyScopeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _accThirdPartyScopeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _accThirdPartyScopeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _accThirdPartyScopeLocalService.dynamicQuery();
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

		return _accThirdPartyScopeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyScopeModelImpl</code>.
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

		return _accThirdPartyScopeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyScopeModelImpl</code>.
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

		return _accThirdPartyScopeLocalService.dynamicQuery(
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

		return _accThirdPartyScopeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _accThirdPartyScopeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
		fetchAccThirdPartyScope(long accThirdPartyScopeId) {

		return _accThirdPartyScopeLocalService.fetchAccThirdPartyScope(
			accThirdPartyScopeId);
	}

	/**
	 * Returns the acc third party scope matching the UUID and group.
	 *
	 * @param uuid the acc third party scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
		fetchAccThirdPartyScopeByUuidAndGroupId(String uuid, long groupId) {

		return _accThirdPartyScopeLocalService.
			fetchAccThirdPartyScopeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns the acc third party scope with the primary key.
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope
	 * @throws PortalException if a acc third party scope with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
			getAccThirdPartyScope(long accThirdPartyScopeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyScopeLocalService.getAccThirdPartyScope(
			accThirdPartyScopeId);
	}

	/**
	 * Returns the acc third party scope matching the UUID and group.
	 *
	 * @param uuid the acc third party scope's UUID
	 * @param groupId the primary key of the group
	 * @return the matching acc third party scope
	 * @throws PortalException if a matching acc third party scope could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
			getAccThirdPartyScopeByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyScopeLocalService.
			getAccThirdPartyScopeByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the acc third party scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @return the range of acc third party scopes
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccThirdPartyScope>
			getAccThirdPartyScopes(int start, int end) {

		return _accThirdPartyScopeLocalService.getAccThirdPartyScopes(
			start, end);
	}

	/**
	 * Returns all the acc third party scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc third party scopes
	 * @param companyId the primary key of the company
	 * @return the matching acc third party scopes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccThirdPartyScope>
			getAccThirdPartyScopesByUuidAndCompanyId(
				String uuid, long companyId) {

		return _accThirdPartyScopeLocalService.
			getAccThirdPartyScopesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of acc third party scopes matching the UUID and company.
	 *
	 * @param uuid the UUID of the acc third party scopes
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching acc third party scopes, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AccThirdPartyScope>
			getAccThirdPartyScopesByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.janaac.application.form.service.model.
						AccThirdPartyScope> orderByComparator) {

		return _accThirdPartyScopeLocalService.
			getAccThirdPartyScopesByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of acc third party scopes.
	 *
	 * @return the number of acc third party scopes
	 */
	@Override
	public int getAccThirdPartyScopesCount() {
		return _accThirdPartyScopeLocalService.getAccThirdPartyScopesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _accThirdPartyScopeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _accThirdPartyScopeLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _accThirdPartyScopeLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
			getJANAAC_ByApplicationId(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return _accThirdPartyScopeLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _accThirdPartyScopeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _accThirdPartyScopeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the acc third party scope in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AccThirdPartyScopeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param accThirdPartyScope the acc third party scope
	 * @return the acc third party scope that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AccThirdPartyScope
		updateAccThirdPartyScope(
			com.nbp.janaac.application.form.service.model.AccThirdPartyScope
				accThirdPartyScope) {

		return _accThirdPartyScopeLocalService.updateAccThirdPartyScope(
			accThirdPartyScope);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _accThirdPartyScopeLocalService.getBasePersistence();
	}

	@Override
	public AccThirdPartyScopeLocalService getWrappedService() {
		return _accThirdPartyScopeLocalService;
	}

	@Override
	public void setWrappedService(
		AccThirdPartyScopeLocalService accThirdPartyScopeLocalService) {

		_accThirdPartyScopeLocalService = accThirdPartyScopeLocalService;
	}

	private AccThirdPartyScopeLocalService _accThirdPartyScopeLocalService;

}