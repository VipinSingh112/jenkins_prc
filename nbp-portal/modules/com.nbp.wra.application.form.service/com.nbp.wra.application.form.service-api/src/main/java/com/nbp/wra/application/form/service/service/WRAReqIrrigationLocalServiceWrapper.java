/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link WRAReqIrrigationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see WRAReqIrrigationLocalService
 * @generated
 */
public class WRAReqIrrigationLocalServiceWrapper
	implements ServiceWrapper<WRAReqIrrigationLocalService>,
			   WRAReqIrrigationLocalService {

	public WRAReqIrrigationLocalServiceWrapper() {
		this(null);
	}

	public WRAReqIrrigationLocalServiceWrapper(
		WRAReqIrrigationLocalService wraReqIrrigationLocalService) {

		_wraReqIrrigationLocalService = wraReqIrrigationLocalService;
	}

	/**
	 * Adds the wra req irrigation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAReqIrrigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraReqIrrigation the wra req irrigation
	 * @return the wra req irrigation that was added
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAReqIrrigation
		addWRAReqIrrigation(
			com.nbp.wra.application.form.service.model.WRAReqIrrigation
				wraReqIrrigation) {

		return _wraReqIrrigationLocalService.addWRAReqIrrigation(
			wraReqIrrigation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraReqIrrigationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new wra req irrigation with the primary key. Does not add the wra req irrigation to the database.
	 *
	 * @param wraReqIrrigationId the primary key for the new wra req irrigation
	 * @return the new wra req irrigation
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAReqIrrigation
		createWRAReqIrrigation(long wraReqIrrigationId) {

		return _wraReqIrrigationLocalService.createWRAReqIrrigation(
			wraReqIrrigationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraReqIrrigationLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the wra req irrigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAReqIrrigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation that was removed
	 * @throws PortalException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAReqIrrigation
			deleteWRAReqIrrigation(long wraReqIrrigationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraReqIrrigationLocalService.deleteWRAReqIrrigation(
			wraReqIrrigationId);
	}

	/**
	 * Deletes the wra req irrigation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAReqIrrigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraReqIrrigation the wra req irrigation
	 * @return the wra req irrigation that was removed
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAReqIrrigation
		deleteWRAReqIrrigation(
			com.nbp.wra.application.form.service.model.WRAReqIrrigation
				wraReqIrrigation) {

		return _wraReqIrrigationLocalService.deleteWRAReqIrrigation(
			wraReqIrrigation);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _wraReqIrrigationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _wraReqIrrigationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _wraReqIrrigationLocalService.dynamicQuery();
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

		return _wraReqIrrigationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAReqIrrigationModelImpl</code>.
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

		return _wraReqIrrigationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAReqIrrigationModelImpl</code>.
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

		return _wraReqIrrigationLocalService.dynamicQuery(
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

		return _wraReqIrrigationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _wraReqIrrigationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.WRAReqIrrigation
		fetchWRAReqIrrigation(long wraReqIrrigationId) {

		return _wraReqIrrigationLocalService.fetchWRAReqIrrigation(
			wraReqIrrigationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _wraReqIrrigationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _wraReqIrrigationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _wraReqIrrigationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraReqIrrigationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAReqIrrigation>
			getWaterRequired_BY_AppId(long wraApplicationId) {

		return _wraReqIrrigationLocalService.getWaterRequired_BY_AppId(
			wraApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAReqIrrigation>
			getWRA_By_CtrAppId(
				long wraApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.wra.application.form.service.model.
						WRAReqIrrigation> orderByComparator) {

		return _wraReqIrrigationLocalService.getWRA_By_CtrAppId(
			wraApplicationId, orderByComparator);
	}

	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAReqIrrigation>
			getWRA_By_Id(long wraApplicationId) {

		return _wraReqIrrigationLocalService.getWRA_By_Id(wraApplicationId);
	}

	/**
	 * Returns the wra req irrigation with the primary key.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation
	 * @throws PortalException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAReqIrrigation
			getWRAReqIrrigation(long wraReqIrrigationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _wraReqIrrigationLocalService.getWRAReqIrrigation(
			wraReqIrrigationId);
	}

	/**
	 * Returns a range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of wra req irrigations
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.WRAReqIrrigation>
			getWRAReqIrrigations(int start, int end) {

		return _wraReqIrrigationLocalService.getWRAReqIrrigations(start, end);
	}

	/**
	 * Returns the number of wra req irrigations.
	 *
	 * @return the number of wra req irrigations
	 */
	@Override
	public int getWRAReqIrrigationsCount() {
		return _wraReqIrrigationLocalService.getWRAReqIrrigationsCount();
	}

	/**
	 * Updates the wra req irrigation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WRAReqIrrigationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraReqIrrigation the wra req irrigation
	 * @return the wra req irrigation that was updated
	 */
	@Override
	public com.nbp.wra.application.form.service.model.WRAReqIrrigation
		updateWRAReqIrrigation(
			com.nbp.wra.application.form.service.model.WRAReqIrrigation
				wraReqIrrigation) {

		return _wraReqIrrigationLocalService.updateWRAReqIrrigation(
			wraReqIrrigation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _wraReqIrrigationLocalService.getBasePersistence();
	}

	@Override
	public WRAReqIrrigationLocalService getWrappedService() {
		return _wraReqIrrigationLocalService;
	}

	@Override
	public void setWrappedService(
		WRAReqIrrigationLocalService wraReqIrrigationLocalService) {

		_wraReqIrrigationLocalService = wraReqIrrigationLocalService;
	}

	private WRAReqIrrigationLocalService _wraReqIrrigationLocalService;

}