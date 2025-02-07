/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddFdaScopeClientLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaScopeClientLocalService
 * @generated
 */
public class AddFdaScopeClientLocalServiceWrapper
	implements AddFdaScopeClientLocalService,
			   ServiceWrapper<AddFdaScopeClientLocalService> {

	public AddFdaScopeClientLocalServiceWrapper() {
		this(null);
	}

	public AddFdaScopeClientLocalServiceWrapper(
		AddFdaScopeClientLocalService addFdaScopeClientLocalService) {

		_addFdaScopeClientLocalService = addFdaScopeClientLocalService;
	}

	/**
	 * Adds the add fda scope client to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaScopeClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaScopeClient the add fda scope client
	 * @return the add fda scope client that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaScopeClient
		addAddFdaScopeClient(
			com.nbp.janaac.application.form.service.model.AddFdaScopeClient
				addFdaScopeClient) {

		return _addFdaScopeClientLocalService.addAddFdaScopeClient(
			addFdaScopeClient);
	}

	/**
	 * Creates a new add fda scope client with the primary key. Does not add the add fda scope client to the database.
	 *
	 * @param addFdaScopeClientId the primary key for the new add fda scope client
	 * @return the new add fda scope client
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaScopeClient
		createAddFdaScopeClient(long addFdaScopeClientId) {

		return _addFdaScopeClientLocalService.createAddFdaScopeClient(
			addFdaScopeClientId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaScopeClientLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add fda scope client from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaScopeClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaScopeClient the add fda scope client
	 * @return the add fda scope client that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaScopeClient
		deleteAddFdaScopeClient(
			com.nbp.janaac.application.form.service.model.AddFdaScopeClient
				addFdaScopeClient) {

		return _addFdaScopeClientLocalService.deleteAddFdaScopeClient(
			addFdaScopeClient);
	}

	/**
	 * Deletes the add fda scope client with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaScopeClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client that was removed
	 * @throws PortalException if a add fda scope client with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaScopeClient
			deleteAddFdaScopeClient(long addFdaScopeClientId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaScopeClientLocalService.deleteAddFdaScopeClient(
			addFdaScopeClientId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaScopeClientLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addFdaScopeClientLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addFdaScopeClientLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addFdaScopeClientLocalService.dynamicQuery();
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

		return _addFdaScopeClientLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaScopeClientModelImpl</code>.
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

		return _addFdaScopeClientLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaScopeClientModelImpl</code>.
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

		return _addFdaScopeClientLocalService.dynamicQuery(
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

		return _addFdaScopeClientLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addFdaScopeClientLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaScopeClient
		fetchAddFdaScopeClient(long addFdaScopeClientId) {

		return _addFdaScopeClientLocalService.fetchAddFdaScopeClient(
			addFdaScopeClientId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addFdaScopeClientLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add fda scope client with the primary key.
	 *
	 * @param addFdaScopeClientId the primary key of the add fda scope client
	 * @return the add fda scope client
	 * @throws PortalException if a add fda scope client with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaScopeClient
			getAddFdaScopeClient(long addFdaScopeClientId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaScopeClientLocalService.getAddFdaScopeClient(
			addFdaScopeClientId);
	}

	/**
	 * Returns a range of all the add fda scope clients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaScopeClientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda scope clients
	 * @param end the upper bound of the range of add fda scope clients (not inclusive)
	 * @return the range of add fda scope clients
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaScopeClient>
			getAddFdaScopeClients(int start, int end) {

		return _addFdaScopeClientLocalService.getAddFdaScopeClients(start, end);
	}

	/**
	 * Returns the number of add fda scope clients.
	 *
	 * @return the number of add fda scope clients
	 */
	@Override
	public int getAddFdaScopeClientsCount() {
		return _addFdaScopeClientLocalService.getAddFdaScopeClientsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addFdaScopeClientLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaScopeClient>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addFdaScopeClientLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaScopeClientLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaScopeClientLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add fda scope client in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaScopeClientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaScopeClient the add fda scope client
	 * @return the add fda scope client that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaScopeClient
		updateAddFdaScopeClient(
			com.nbp.janaac.application.form.service.model.AddFdaScopeClient
				addFdaScopeClient) {

		return _addFdaScopeClientLocalService.updateAddFdaScopeClient(
			addFdaScopeClient);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addFdaScopeClientLocalService.getBasePersistence();
	}

	@Override
	public AddFdaScopeClientLocalService getWrappedService() {
		return _addFdaScopeClientLocalService;
	}

	@Override
	public void setWrappedService(
		AddFdaScopeClientLocalService addFdaScopeClientLocalService) {

		_addFdaScopeClientLocalService = addFdaScopeClientLocalService;
	}

	private AddFdaScopeClientLocalService _addFdaScopeClientLocalService;

}