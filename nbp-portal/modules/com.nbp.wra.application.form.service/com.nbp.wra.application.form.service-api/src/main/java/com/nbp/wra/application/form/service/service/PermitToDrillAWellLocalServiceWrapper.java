/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PermitToDrillAWellLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PermitToDrillAWellLocalService
 * @generated
 */
public class PermitToDrillAWellLocalServiceWrapper
	implements PermitToDrillAWellLocalService,
			   ServiceWrapper<PermitToDrillAWellLocalService> {

	public PermitToDrillAWellLocalServiceWrapper() {
		this(null);
	}

	public PermitToDrillAWellLocalServiceWrapper(
		PermitToDrillAWellLocalService permitToDrillAWellLocalService) {

		_permitToDrillAWellLocalService = permitToDrillAWellLocalService;
	}

	/**
	 * Adds the permit to drill a well to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was added
	 */
	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
		addPermitToDrillAWell(
			com.nbp.wra.application.form.service.model.PermitToDrillAWell
				permitToDrillAWell) {

		return _permitToDrillAWellLocalService.addPermitToDrillAWell(
			permitToDrillAWell);
	}

	/**
	 * Creates a new permit to drill a well with the primary key. Does not add the permit to drill a well to the database.
	 *
	 * @param drillAWellApplicationId the primary key for the new permit to drill a well
	 * @return the new permit to drill a well
	 */
	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
		createPermitToDrillAWell(long drillAWellApplicationId) {

		return _permitToDrillAWellLocalService.createPermitToDrillAWell(
			drillAWellApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permitToDrillAWellLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the permit to drill a well with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well that was removed
	 * @throws PortalException if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
			deletePermitToDrillAWell(long drillAWellApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permitToDrillAWellLocalService.deletePermitToDrillAWell(
			drillAWellApplicationId);
	}

	/**
	 * Deletes the permit to drill a well from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was removed
	 */
	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
		deletePermitToDrillAWell(
			com.nbp.wra.application.form.service.model.PermitToDrillAWell
				permitToDrillAWell) {

		return _permitToDrillAWellLocalService.deletePermitToDrillAWell(
			permitToDrillAWell);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permitToDrillAWellLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _permitToDrillAWellLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _permitToDrillAWellLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _permitToDrillAWellLocalService.dynamicQuery();
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

		return _permitToDrillAWellLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
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

		return _permitToDrillAWellLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
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

		return _permitToDrillAWellLocalService.dynamicQuery(
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

		return _permitToDrillAWellLocalService.dynamicQueryCount(dynamicQuery);
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

		return _permitToDrillAWellLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
		fetchPermitToDrillAWell(long drillAWellApplicationId) {

		return _permitToDrillAWellLocalService.fetchPermitToDrillAWell(
			drillAWellApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _permitToDrillAWellLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _permitToDrillAWellLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _permitToDrillAWellLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the permit to drill a well with the primary key.
	 *
	 * @param drillAWellApplicationId the primary key of the permit to drill a well
	 * @return the permit to drill a well
	 * @throws PortalException if a permit to drill a well with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
			getPermitToDrillAWell(long drillAWellApplicationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permitToDrillAWellLocalService.getPermitToDrillAWell(
			drillAWellApplicationId);
	}

	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
		getPermitToDrillAWell_By_Id() {

		return _permitToDrillAWellLocalService.getPermitToDrillAWell_By_Id();
	}

	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
			getPermitToDrillAWell_By_WRAAppId(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchPermitToDrillAWellException {

		return _permitToDrillAWellLocalService.
			getPermitToDrillAWell_By_WRAAppId(wraApplicationId);
	}

	/**
	 * Returns a range of all the permit to drill a wells.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.PermitToDrillAWellModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of permit to drill a wells
	 * @param end the upper bound of the range of permit to drill a wells (not inclusive)
	 * @return the range of permit to drill a wells
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.PermitToDrillAWell>
			getPermitToDrillAWells(int start, int end) {

		return _permitToDrillAWellLocalService.getPermitToDrillAWells(
			start, end);
	}

	/**
	 * Returns the number of permit to drill a wells.
	 *
	 * @return the number of permit to drill a wells
	 */
	@Override
	public int getPermitToDrillAWellsCount() {
		return _permitToDrillAWellLocalService.getPermitToDrillAWellsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _permitToDrillAWellLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the permit to drill a well in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PermitToDrillAWellLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param permitToDrillAWell the permit to drill a well
	 * @return the permit to drill a well that was updated
	 */
	@Override
	public com.nbp.wra.application.form.service.model.PermitToDrillAWell
		updatePermitToDrillAWell(
			com.nbp.wra.application.form.service.model.PermitToDrillAWell
				permitToDrillAWell) {

		return _permitToDrillAWellLocalService.updatePermitToDrillAWell(
			permitToDrillAWell);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _permitToDrillAWellLocalService.getBasePersistence();
	}

	@Override
	public PermitToDrillAWellLocalService getWrappedService() {
		return _permitToDrillAWellLocalService;
	}

	@Override
	public void setWrappedService(
		PermitToDrillAWellLocalService permitToDrillAWellLocalService) {

		_permitToDrillAWellLocalService = permitToDrillAWellLocalService;
	}

	private PermitToDrillAWellLocalService _permitToDrillAWellLocalService;

}