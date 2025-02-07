/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link BrokerDeclarationInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BrokerDeclarationInfoLocalService
 * @generated
 */
public class BrokerDeclarationInfoLocalServiceWrapper
	implements BrokerDeclarationInfoLocalService,
			   ServiceWrapper<BrokerDeclarationInfoLocalService> {

	public BrokerDeclarationInfoLocalServiceWrapper() {
		this(null);
	}

	public BrokerDeclarationInfoLocalServiceWrapper(
		BrokerDeclarationInfoLocalService brokerDeclarationInfoLocalService) {

		_brokerDeclarationInfoLocalService = brokerDeclarationInfoLocalService;
	}

	/**
	 * Adds the broker declaration info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerDeclarationInfo the broker declaration info
	 * @return the broker declaration info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
		addBrokerDeclarationInfo(
			com.nbp.hsra.application.service.model.BrokerDeclarationInfo
				brokerDeclarationInfo) {

		return _brokerDeclarationInfoLocalService.addBrokerDeclarationInfo(
			brokerDeclarationInfo);
	}

	/**
	 * Creates a new broker declaration info with the primary key. Does not add the broker declaration info to the database.
	 *
	 * @param brokerDeclareInfoId the primary key for the new broker declaration info
	 * @return the new broker declaration info
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
		createBrokerDeclarationInfo(long brokerDeclareInfoId) {

		return _brokerDeclarationInfoLocalService.createBrokerDeclarationInfo(
			brokerDeclareInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerDeclarationInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the broker declaration info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerDeclarationInfo the broker declaration info
	 * @return the broker declaration info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
		deleteBrokerDeclarationInfo(
			com.nbp.hsra.application.service.model.BrokerDeclarationInfo
				brokerDeclarationInfo) {

		return _brokerDeclarationInfoLocalService.deleteBrokerDeclarationInfo(
			brokerDeclarationInfo);
	}

	/**
	 * Deletes the broker declaration info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info that was removed
	 * @throws PortalException if a broker declaration info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
			deleteBrokerDeclarationInfo(long brokerDeclareInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerDeclarationInfoLocalService.deleteBrokerDeclarationInfo(
			brokerDeclareInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerDeclarationInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _brokerDeclarationInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _brokerDeclarationInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _brokerDeclarationInfoLocalService.dynamicQuery();
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

		return _brokerDeclarationInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.BrokerDeclarationInfoModelImpl</code>.
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

		return _brokerDeclarationInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.BrokerDeclarationInfoModelImpl</code>.
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

		return _brokerDeclarationInfoLocalService.dynamicQuery(
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

		return _brokerDeclarationInfoLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _brokerDeclarationInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
		fetchBrokerDeclarationInfo(long brokerDeclareInfoId) {

		return _brokerDeclarationInfoLocalService.fetchBrokerDeclarationInfo(
			brokerDeclareInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _brokerDeclarationInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the broker declaration info with the primary key.
	 *
	 * @param brokerDeclareInfoId the primary key of the broker declaration info
	 * @return the broker declaration info
	 * @throws PortalException if a broker declaration info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
			getBrokerDeclarationInfo(long brokerDeclareInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerDeclarationInfoLocalService.getBrokerDeclarationInfo(
			brokerDeclareInfoId);
	}

	/**
	 * Returns a range of all the broker declaration infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.BrokerDeclarationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of broker declaration infos
	 * @param end the upper bound of the range of broker declaration infos (not inclusive)
	 * @return the range of broker declaration infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.BrokerDeclarationInfo>
			getBrokerDeclarationInfos(int start, int end) {

		return _brokerDeclarationInfoLocalService.getBrokerDeclarationInfos(
			start, end);
	}

	/**
	 * Returns the number of broker declaration infos.
	 *
	 * @return the number of broker declaration infos
	 */
	@Override
	public int getBrokerDeclarationInfosCount() {
		return _brokerDeclarationInfoLocalService.
			getBrokerDeclarationInfosCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchBrokerDeclarationInfoException {

		return _brokerDeclarationInfoLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _brokerDeclarationInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _brokerDeclarationInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _brokerDeclarationInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the broker declaration info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BrokerDeclarationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param brokerDeclarationInfo the broker declaration info
	 * @return the broker declaration info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.BrokerDeclarationInfo
		updateBrokerDeclarationInfo(
			com.nbp.hsra.application.service.model.BrokerDeclarationInfo
				brokerDeclarationInfo) {

		return _brokerDeclarationInfoLocalService.updateBrokerDeclarationInfo(
			brokerDeclarationInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _brokerDeclarationInfoLocalService.getBasePersistence();
	}

	@Override
	public BrokerDeclarationInfoLocalService getWrappedService() {
		return _brokerDeclarationInfoLocalService;
	}

	@Override
	public void setWrappedService(
		BrokerDeclarationInfoLocalService brokerDeclarationInfoLocalService) {

		_brokerDeclarationInfoLocalService = brokerDeclarationInfoLocalService;
	}

	private BrokerDeclarationInfoLocalService
		_brokerDeclarationInfoLocalService;

}