/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezZoneFinancialInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneFinancialInfoLocalService
 * @generated
 */
public class SezZoneFinancialInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneFinancialInfoLocalService>,
			   SezZoneFinancialInfoLocalService {

	public SezZoneFinancialInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneFinancialInfoLocalServiceWrapper(
		SezZoneFinancialInfoLocalService sezZoneFinancialInfoLocalService) {

		_sezZoneFinancialInfoLocalService = sezZoneFinancialInfoLocalService;
	}

	/**
	 * Adds the sez zone financial info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneFinancialInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneFinancialInfo the sez zone financial info
	 * @return the sez zone financial info that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
			addSezZoneFinancialInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneFinancialInfo sezZoneFinancialInfo) {

		return _sezZoneFinancialInfoLocalService.addSezZoneFinancialInfo(
			sezZoneFinancialInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneFinancialInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone financial info with the primary key. Does not add the sez zone financial info to the database.
	 *
	 * @param sezZoneFinancialnfoId the primary key for the new sez zone financial info
	 * @return the new sez zone financial info
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
			createSezZoneFinancialInfo(long sezZoneFinancialnfoId) {

		return _sezZoneFinancialInfoLocalService.createSezZoneFinancialInfo(
			sezZoneFinancialnfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneFinancialInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone financial info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneFinancialInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info that was removed
	 * @throws PortalException if a sez zone financial info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
				deleteSezZoneFinancialInfo(long sezZoneFinancialnfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneFinancialInfoLocalService.deleteSezZoneFinancialInfo(
			sezZoneFinancialnfoId);
	}

	/**
	 * Deletes the sez zone financial info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneFinancialInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneFinancialInfo the sez zone financial info
	 * @return the sez zone financial info that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
			deleteSezZoneFinancialInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneFinancialInfo sezZoneFinancialInfo) {

		return _sezZoneFinancialInfoLocalService.deleteSezZoneFinancialInfo(
			sezZoneFinancialInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneFinancialInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneFinancialInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneFinancialInfoLocalService.dynamicQuery();
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

		return _sezZoneFinancialInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneFinancialInfoModelImpl</code>.
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

		return _sezZoneFinancialInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneFinancialInfoModelImpl</code>.
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

		return _sezZoneFinancialInfoLocalService.dynamicQuery(
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

		return _sezZoneFinancialInfoLocalService.dynamicQueryCount(
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

		return _sezZoneFinancialInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
			fetchSezZoneFinancialInfo(long sezZoneFinancialnfoId) {

		return _sezZoneFinancialInfoLocalService.fetchSezZoneFinancialInfo(
			sezZoneFinancialnfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneFinancialInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneFinancialInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneFinancialInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneFinancialInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
				getSezById(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezZoneFinancialInfoException {

		return _sezZoneFinancialInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone financial info with the primary key.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info
	 * @throws PortalException if a sez zone financial info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
				getSezZoneFinancialInfo(long sezZoneFinancialnfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneFinancialInfoLocalService.getSezZoneFinancialInfo(
			sezZoneFinancialnfoId);
	}

	/**
	 * Returns a range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @return the range of sez zone financial infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo>
			getSezZoneFinancialInfos(int start, int end) {

		return _sezZoneFinancialInfoLocalService.getSezZoneFinancialInfos(
			start, end);
	}

	/**
	 * Returns the number of sez zone financial infos.
	 *
	 * @return the number of sez zone financial infos
	 */
	@Override
	public int getSezZoneFinancialInfosCount() {
		return _sezZoneFinancialInfoLocalService.
			getSezZoneFinancialInfosCount();
	}

	/**
	 * Updates the sez zone financial info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneFinancialInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneFinancialInfo the sez zone financial info
	 * @return the sez zone financial info that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo
			updateSezZoneFinancialInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneFinancialInfo sezZoneFinancialInfo) {

		return _sezZoneFinancialInfoLocalService.updateSezZoneFinancialInfo(
			sezZoneFinancialInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezZoneFinancialInfoLocalService.getBasePersistence();
	}

	@Override
	public SezZoneFinancialInfoLocalService getWrappedService() {
		return _sezZoneFinancialInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneFinancialInfoLocalService sezZoneFinancialInfoLocalService) {

		_sezZoneFinancialInfoLocalService = sezZoneFinancialInfoLocalService;
	}

	private SezZoneFinancialInfoLocalService _sezZoneFinancialInfoLocalService;

}