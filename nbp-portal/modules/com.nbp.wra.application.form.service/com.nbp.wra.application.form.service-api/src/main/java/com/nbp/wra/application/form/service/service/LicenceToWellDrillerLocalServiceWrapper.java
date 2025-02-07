/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link LicenceToWellDrillerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDrillerLocalService
 * @generated
 */
public class LicenceToWellDrillerLocalServiceWrapper
	implements LicenceToWellDrillerLocalService,
			   ServiceWrapper<LicenceToWellDrillerLocalService> {

	public LicenceToWellDrillerLocalServiceWrapper() {
		this(null);
	}

	public LicenceToWellDrillerLocalServiceWrapper(
		LicenceToWellDrillerLocalService licenceToWellDrillerLocalService) {

		_licenceToWellDrillerLocalService = licenceToWellDrillerLocalService;
	}

	/**
	 * Adds the licence to well driller to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDriller the licence to well driller
	 * @return the licence to well driller that was added
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
		addLicenceToWellDriller(
			com.nbp.wra.application.form.service.model.LicenceToWellDriller
				licenceToWellDriller) {

		return _licenceToWellDrillerLocalService.addLicenceToWellDriller(
			licenceToWellDriller);
	}

	/**
	 * Creates a new licence to well driller with the primary key. Does not add the licence to well driller to the database.
	 *
	 * @param licenceToWellDrillerId the primary key for the new licence to well driller
	 * @return the new licence to well driller
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
		createLicenceToWellDriller(long licenceToWellDrillerId) {

		return _licenceToWellDrillerLocalService.createLicenceToWellDriller(
			licenceToWellDrillerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToWellDrillerLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the licence to well driller from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDriller the licence to well driller
	 * @return the licence to well driller that was removed
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
		deleteLicenceToWellDriller(
			com.nbp.wra.application.form.service.model.LicenceToWellDriller
				licenceToWellDriller) {

		return _licenceToWellDrillerLocalService.deleteLicenceToWellDriller(
			licenceToWellDriller);
	}

	/**
	 * Deletes the licence to well driller with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller that was removed
	 * @throws PortalException if a licence to well driller with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
			deleteLicenceToWellDriller(long licenceToWellDrillerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToWellDrillerLocalService.deleteLicenceToWellDriller(
			licenceToWellDrillerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToWellDrillerLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _licenceToWellDrillerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _licenceToWellDrillerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _licenceToWellDrillerLocalService.dynamicQuery();
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

		return _licenceToWellDrillerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl</code>.
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

		return _licenceToWellDrillerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl</code>.
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

		return _licenceToWellDrillerLocalService.dynamicQuery(
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

		return _licenceToWellDrillerLocalService.dynamicQueryCount(
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

		return _licenceToWellDrillerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
		fetchLicenceToWellDriller(long licenceToWellDrillerId) {

		return _licenceToWellDrillerLocalService.fetchLicenceToWellDriller(
			licenceToWellDrillerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _licenceToWellDrillerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _licenceToWellDrillerLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the licence to well driller with the primary key.
	 *
	 * @param licenceToWellDrillerId the primary key of the licence to well driller
	 * @return the licence to well driller
	 * @throws PortalException if a licence to well driller with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
			getLicenceToWellDriller(long licenceToWellDrillerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToWellDrillerLocalService.getLicenceToWellDriller(
			licenceToWellDrillerId);
	}

	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
			getLicenceToWellDriller_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchLicenceToWellDrillerException {

		return _licenceToWellDrillerLocalService.getLicenceToWellDriller_By_Id(
			wraApplicationId);
	}

	/**
	 * Returns a range of all the licence to well drillers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of licence to well drillers
	 * @param end the upper bound of the range of licence to well drillers (not inclusive)
	 * @return the range of licence to well drillers
	 */
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.LicenceToWellDriller>
			getLicenceToWellDrillers(int start, int end) {

		return _licenceToWellDrillerLocalService.getLicenceToWellDrillers(
			start, end);
	}

	/**
	 * Returns the number of licence to well drillers.
	 *
	 * @return the number of licence to well drillers
	 */
	@Override
	public int getLicenceToWellDrillersCount() {
		return _licenceToWellDrillerLocalService.
			getLicenceToWellDrillersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _licenceToWellDrillerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _licenceToWellDrillerLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the licence to well driller in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LicenceToWellDrillerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param licenceToWellDriller the licence to well driller
	 * @return the licence to well driller that was updated
	 */
	@Override
	public com.nbp.wra.application.form.service.model.LicenceToWellDriller
		updateLicenceToWellDriller(
			com.nbp.wra.application.form.service.model.LicenceToWellDriller
				licenceToWellDriller) {

		return _licenceToWellDrillerLocalService.updateLicenceToWellDriller(
			licenceToWellDriller);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _licenceToWellDrillerLocalService.getBasePersistence();
	}

	@Override
	public LicenceToWellDrillerLocalService getWrappedService() {
		return _licenceToWellDrillerLocalService;
	}

	@Override
	public void setWrappedService(
		LicenceToWellDrillerLocalService licenceToWellDrillerLocalService) {

		_licenceToWellDrillerLocalService = licenceToWellDrillerLocalService;
	}

	private LicenceToWellDrillerLocalService _licenceToWellDrillerLocalService;

}