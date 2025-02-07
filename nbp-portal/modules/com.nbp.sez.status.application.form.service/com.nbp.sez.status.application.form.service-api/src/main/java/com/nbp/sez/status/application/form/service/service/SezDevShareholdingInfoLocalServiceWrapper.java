/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevShareholdingInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareholdingInfoLocalService
 * @generated
 */
public class SezDevShareholdingInfoLocalServiceWrapper
	implements ServiceWrapper<SezDevShareholdingInfoLocalService>,
			   SezDevShareholdingInfoLocalService {

	public SezDevShareholdingInfoLocalServiceWrapper() {
		this(null);
	}

	public SezDevShareholdingInfoLocalServiceWrapper(
		SezDevShareholdingInfoLocalService sezDevShareholdingInfoLocalService) {

		_sezDevShareholdingInfoLocalService =
			sezDevShareholdingInfoLocalService;
	}

	/**
	 * Adds the sez dev shareholding info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareholdingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareholdingInfo the sez dev shareholding info
	 * @return the sez dev shareholding info that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
			addSezDevShareholdingInfo(
				com.nbp.sez.status.application.form.service.model.
					SezDevShareholdingInfo sezDevShareholdingInfo) {

		return _sezDevShareholdingInfoLocalService.addSezDevShareholdingInfo(
			sezDevShareholdingInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareholdingInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev shareholding info with the primary key. Does not add the sez dev shareholding info to the database.
	 *
	 * @param sezDevShareholdingInfoId the primary key for the new sez dev shareholding info
	 * @return the new sez dev shareholding info
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
			createSezDevShareholdingInfo(long sezDevShareholdingInfoId) {

		return _sezDevShareholdingInfoLocalService.createSezDevShareholdingInfo(
			sezDevShareholdingInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareholdingInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev shareholding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareholdingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info that was removed
	 * @throws PortalException if a sez dev shareholding info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
				deleteSezDevShareholdingInfo(long sezDevShareholdingInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareholdingInfoLocalService.deleteSezDevShareholdingInfo(
			sezDevShareholdingInfoId);
	}

	/**
	 * Deletes the sez dev shareholding info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareholdingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareholdingInfo the sez dev shareholding info
	 * @return the sez dev shareholding info that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
			deleteSezDevShareholdingInfo(
				com.nbp.sez.status.application.form.service.model.
					SezDevShareholdingInfo sezDevShareholdingInfo) {

		return _sezDevShareholdingInfoLocalService.deleteSezDevShareholdingInfo(
			sezDevShareholdingInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevShareholdingInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevShareholdingInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevShareholdingInfoLocalService.dynamicQuery();
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

		return _sezDevShareholdingInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareholdingInfoModelImpl</code>.
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

		return _sezDevShareholdingInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareholdingInfoModelImpl</code>.
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

		return _sezDevShareholdingInfoLocalService.dynamicQuery(
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

		return _sezDevShareholdingInfoLocalService.dynamicQueryCount(
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

		return _sezDevShareholdingInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
			fetchSezDevShareholdingInfo(long sezDevShareholdingInfoId) {

		return _sezDevShareholdingInfoLocalService.fetchSezDevShareholdingInfo(
			sezDevShareholdingInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevShareholdingInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevShareholdingInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareholdingInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareholdingInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
				getSezById(long sezStatusApplicationId)
			throws com.nbp.sez.status.application.form.service.exception.
				NoSuchSezDevShareholdingInfoException {

		return _sezDevShareholdingInfoLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev shareholding info with the primary key.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info
	 * @throws PortalException if a sez dev shareholding info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
				getSezDevShareholdingInfo(long sezDevShareholdingInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareholdingInfoLocalService.getSezDevShareholdingInfo(
			sezDevShareholdingInfoId);
	}

	/**
	 * Returns a range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @return the range of sez dev shareholding infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevShareholdingInfo> getSezDevShareholdingInfos(
				int start, int end) {

		return _sezDevShareholdingInfoLocalService.getSezDevShareholdingInfos(
			start, end);
	}

	/**
	 * Returns the number of sez dev shareholding infos.
	 *
	 * @return the number of sez dev shareholding infos
	 */
	@Override
	public int getSezDevShareholdingInfosCount() {
		return _sezDevShareholdingInfoLocalService.
			getSezDevShareholdingInfosCount();
	}

	/**
	 * Updates the sez dev shareholding info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareholdingInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareholdingInfo the sez dev shareholding info
	 * @return the sez dev shareholding info that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo
			updateSezDevShareholdingInfo(
				com.nbp.sez.status.application.form.service.model.
					SezDevShareholdingInfo sezDevShareholdingInfo) {

		return _sezDevShareholdingInfoLocalService.updateSezDevShareholdingInfo(
			sezDevShareholdingInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevShareholdingInfoLocalService.getBasePersistence();
	}

	@Override
	public SezDevShareholdingInfoLocalService getWrappedService() {
		return _sezDevShareholdingInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevShareholdingInfoLocalService sezDevShareholdingInfoLocalService) {

		_sezDevShareholdingInfoLocalService =
			sezDevShareholdingInfoLocalService;
	}

	private SezDevShareholdingInfoLocalService
		_sezDevShareholdingInfoLocalService;

}