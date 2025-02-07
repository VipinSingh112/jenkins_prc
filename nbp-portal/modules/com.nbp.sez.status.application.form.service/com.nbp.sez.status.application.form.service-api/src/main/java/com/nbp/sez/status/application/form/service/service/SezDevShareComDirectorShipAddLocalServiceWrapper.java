/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevShareComDirectorShipAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareComDirectorShipAddLocalService
 * @generated
 */
public class SezDevShareComDirectorShipAddLocalServiceWrapper
	implements ServiceWrapper<SezDevShareComDirectorShipAddLocalService>,
			   SezDevShareComDirectorShipAddLocalService {

	public SezDevShareComDirectorShipAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevShareComDirectorShipAddLocalServiceWrapper(
		SezDevShareComDirectorShipAddLocalService
			sezDevShareComDirectorShipAddLocalService) {

		_sezDevShareComDirectorShipAddLocalService =
			sezDevShareComDirectorShipAddLocalService;
	}

	/**
	 * Adds the sez dev share com director ship add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareComDirectorShipAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareComDirectorShipAdd the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareComDirectorShipAdd addSezDevShareComDirectorShipAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		return _sezDevShareComDirectorShipAddLocalService.
			addSezDevShareComDirectorShipAdd(sezDevShareComDirectorShipAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareComDirectorShipAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev share com director ship add with the primary key. Does not add the sez dev share com director ship add to the database.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key for the new sez dev share com director ship add
	 * @return the new sez dev share com director ship add
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareComDirectorShipAdd createSezDevShareComDirectorShipAdd(
			long sezDevSharComDirectorShipAddId) {

		return _sezDevShareComDirectorShipAddLocalService.
			createSezDevShareComDirectorShipAdd(sezDevSharComDirectorShipAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareComDirectorShipAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev share com director ship add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareComDirectorShipAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was removed
	 * @throws PortalException if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareComDirectorShipAdd deleteSezDevShareComDirectorShipAdd(
				long sezDevSharComDirectorShipAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareComDirectorShipAddLocalService.
			deleteSezDevShareComDirectorShipAdd(sezDevSharComDirectorShipAddId);
	}

	/**
	 * Deletes the sez dev share com director ship add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareComDirectorShipAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareComDirectorShipAdd the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareComDirectorShipAdd deleteSezDevShareComDirectorShipAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		return _sezDevShareComDirectorShipAddLocalService.
			deleteSezDevShareComDirectorShipAdd(sezDevShareComDirectorShipAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevShareComDirectorShipAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevShareComDirectorShipAddLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevShareComDirectorShipAddLocalService.dynamicQuery();
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

		return _sezDevShareComDirectorShipAddLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareComDirectorShipAddModelImpl</code>.
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

		return _sezDevShareComDirectorShipAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareComDirectorShipAddModelImpl</code>.
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

		return _sezDevShareComDirectorShipAddLocalService.dynamicQuery(
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

		return _sezDevShareComDirectorShipAddLocalService.dynamicQueryCount(
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

		return _sezDevShareComDirectorShipAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareComDirectorShipAdd fetchSezDevShareComDirectorShipAdd(
			long sezDevSharComDirectorShipAddId) {

		return _sezDevShareComDirectorShipAddLocalService.
			fetchSezDevShareComDirectorShipAdd(sezDevSharComDirectorShipAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevShareComDirectorShipAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevShareComDirectorShipAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareComDirectorShipAddLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareComDirectorShipAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevShareComDirectorShipAdd> getSezById(
				long sezStatusApplicationId) {

		return _sezDevShareComDirectorShipAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev share com director ship add with the primary key.
	 *
	 * @param sezDevSharComDirectorShipAddId the primary key of the sez dev share com director ship add
	 * @return the sez dev share com director ship add
	 * @throws PortalException if a sez dev share com director ship add with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareComDirectorShipAdd getSezDevShareComDirectorShipAdd(
				long sezDevSharComDirectorShipAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareComDirectorShipAddLocalService.
			getSezDevShareComDirectorShipAdd(sezDevSharComDirectorShipAddId);
	}

	/**
	 * Returns a range of all the sez dev share com director ship adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareComDirectorShipAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share com director ship adds
	 * @param end the upper bound of the range of sez dev share com director ship adds (not inclusive)
	 * @return the range of sez dev share com director ship adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevShareComDirectorShipAdd> getSezDevShareComDirectorShipAdds(
				int start, int end) {

		return _sezDevShareComDirectorShipAddLocalService.
			getSezDevShareComDirectorShipAdds(start, end);
	}

	/**
	 * Returns the number of sez dev share com director ship adds.
	 *
	 * @return the number of sez dev share com director ship adds
	 */
	@Override
	public int getSezDevShareComDirectorShipAddsCount() {
		return _sezDevShareComDirectorShipAddLocalService.
			getSezDevShareComDirectorShipAddsCount();
	}

	/**
	 * Updates the sez dev share com director ship add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareComDirectorShipAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareComDirectorShipAdd the sez dev share com director ship add
	 * @return the sez dev share com director ship add that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.
		SezDevShareComDirectorShipAdd updateSezDevShareComDirectorShipAdd(
			com.nbp.sez.status.application.form.service.model.
				SezDevShareComDirectorShipAdd sezDevShareComDirectorShipAdd) {

		return _sezDevShareComDirectorShipAddLocalService.
			updateSezDevShareComDirectorShipAdd(sezDevShareComDirectorShipAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevShareComDirectorShipAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevShareComDirectorShipAddLocalService getWrappedService() {
		return _sezDevShareComDirectorShipAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevShareComDirectorShipAddLocalService
			sezDevShareComDirectorShipAddLocalService) {

		_sezDevShareComDirectorShipAddLocalService =
			sezDevShareComDirectorShipAddLocalService;
	}

	private SezDevShareComDirectorShipAddLocalService
		_sezDevShareComDirectorShipAddLocalService;

}