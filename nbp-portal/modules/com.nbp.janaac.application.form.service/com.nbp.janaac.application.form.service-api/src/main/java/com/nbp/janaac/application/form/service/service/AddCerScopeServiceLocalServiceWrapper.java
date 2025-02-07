/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddCerScopeServiceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerScopeServiceLocalService
 * @generated
 */
public class AddCerScopeServiceLocalServiceWrapper
	implements AddCerScopeServiceLocalService,
			   ServiceWrapper<AddCerScopeServiceLocalService> {

	public AddCerScopeServiceLocalServiceWrapper() {
		this(null);
	}

	public AddCerScopeServiceLocalServiceWrapper(
		AddCerScopeServiceLocalService addCerScopeServiceLocalService) {

		_addCerScopeServiceLocalService = addCerScopeServiceLocalService;
	}

	/**
	 * Adds the add cer scope service to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeService the add cer scope service
	 * @return the add cer scope service that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeService
		addAddCerScopeService(
			com.nbp.janaac.application.form.service.model.AddCerScopeService
				addCerScopeService) {

		return _addCerScopeServiceLocalService.addAddCerScopeService(
			addCerScopeService);
	}

	/**
	 * Creates a new add cer scope service with the primary key. Does not add the add cer scope service to the database.
	 *
	 * @param addCerScopeServiceId the primary key for the new add cer scope service
	 * @return the new add cer scope service
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeService
		createAddCerScopeService(long addCerScopeServiceId) {

		return _addCerScopeServiceLocalService.createAddCerScopeService(
			addCerScopeServiceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add cer scope service from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeService the add cer scope service
	 * @return the add cer scope service that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeService
		deleteAddCerScopeService(
			com.nbp.janaac.application.form.service.model.AddCerScopeService
				addCerScopeService) {

		return _addCerScopeServiceLocalService.deleteAddCerScopeService(
			addCerScopeService);
	}

	/**
	 * Deletes the add cer scope service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service that was removed
	 * @throws PortalException if a add cer scope service with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeService
			deleteAddCerScopeService(long addCerScopeServiceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceLocalService.deleteAddCerScopeService(
			addCerScopeServiceId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addCerScopeServiceLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addCerScopeServiceLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addCerScopeServiceLocalService.dynamicQuery();
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

		return _addCerScopeServiceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceModelImpl</code>.
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

		return _addCerScopeServiceLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceModelImpl</code>.
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

		return _addCerScopeServiceLocalService.dynamicQuery(
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

		return _addCerScopeServiceLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addCerScopeServiceLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeService
		fetchAddCerScopeService(long addCerScopeServiceId) {

		return _addCerScopeServiceLocalService.fetchAddCerScopeService(
			addCerScopeServiceId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addCerScopeServiceLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add cer scope service with the primary key.
	 *
	 * @param addCerScopeServiceId the primary key of the add cer scope service
	 * @return the add cer scope service
	 * @throws PortalException if a add cer scope service with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeService
			getAddCerScopeService(long addCerScopeServiceId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceLocalService.getAddCerScopeService(
			addCerScopeServiceId);
	}

	/**
	 * Returns a range of all the add cer scope services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerScopeServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer scope services
	 * @param end the upper bound of the range of add cer scope services (not inclusive)
	 * @return the range of add cer scope services
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerScopeService>
			getAddCerScopeServices(int start, int end) {

		return _addCerScopeServiceLocalService.getAddCerScopeServices(
			start, end);
	}

	/**
	 * Returns the number of add cer scope services.
	 *
	 * @return the number of add cer scope services
	 */
	@Override
	public int getAddCerScopeServicesCount() {
		return _addCerScopeServiceLocalService.getAddCerScopeServicesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addCerScopeServiceLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerScopeService>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addCerScopeServiceLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerScopeServiceLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerScopeServiceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add cer scope service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerScopeServiceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerScopeService the add cer scope service
	 * @return the add cer scope service that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerScopeService
		updateAddCerScopeService(
			com.nbp.janaac.application.form.service.model.AddCerScopeService
				addCerScopeService) {

		return _addCerScopeServiceLocalService.updateAddCerScopeService(
			addCerScopeService);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addCerScopeServiceLocalService.getBasePersistence();
	}

	@Override
	public AddCerScopeServiceLocalService getWrappedService() {
		return _addCerScopeServiceLocalService;
	}

	@Override
	public void setWrappedService(
		AddCerScopeServiceLocalService addCerScopeServiceLocalService) {

		_addCerScopeServiceLocalService = addCerScopeServiceLocalService;
	}

	private AddCerScopeServiceLocalService _addCerScopeServiceLocalService;

}