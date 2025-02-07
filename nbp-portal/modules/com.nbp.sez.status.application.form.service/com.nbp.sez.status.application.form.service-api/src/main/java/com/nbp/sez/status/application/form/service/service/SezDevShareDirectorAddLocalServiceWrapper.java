/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevShareDirectorAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareDirectorAddLocalService
 * @generated
 */
public class SezDevShareDirectorAddLocalServiceWrapper
	implements ServiceWrapper<SezDevShareDirectorAddLocalService>,
			   SezDevShareDirectorAddLocalService {

	public SezDevShareDirectorAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevShareDirectorAddLocalServiceWrapper(
		SezDevShareDirectorAddLocalService sezDevShareDirectorAddLocalService) {

		_sezDevShareDirectorAddLocalService =
			sezDevShareDirectorAddLocalService;
	}

	/**
	 * Adds the sez dev share director add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareDirectorAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareDirectorAdd the sez dev share director add
	 * @return the sez dev share director add that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd
			addSezDevShareDirectorAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		return _sezDevShareDirectorAddLocalService.addSezDevShareDirectorAdd(
			sezDevShareDirectorAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareDirectorAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev share director add with the primary key. Does not add the sez dev share director add to the database.
	 *
	 * @param sezDevShareDirectorAddId the primary key for the new sez dev share director add
	 * @return the new sez dev share director add
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd
			createSezDevShareDirectorAdd(long sezDevShareDirectorAddId) {

		return _sezDevShareDirectorAddLocalService.createSezDevShareDirectorAdd(
			sezDevShareDirectorAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareDirectorAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev share director add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareDirectorAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add that was removed
	 * @throws PortalException if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd
				deleteSezDevShareDirectorAdd(long sezDevShareDirectorAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareDirectorAddLocalService.deleteSezDevShareDirectorAdd(
			sezDevShareDirectorAddId);
	}

	/**
	 * Deletes the sez dev share director add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareDirectorAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareDirectorAdd the sez dev share director add
	 * @return the sez dev share director add that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd
			deleteSezDevShareDirectorAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		return _sezDevShareDirectorAddLocalService.deleteSezDevShareDirectorAdd(
			sezDevShareDirectorAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevShareDirectorAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevShareDirectorAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevShareDirectorAddLocalService.dynamicQuery();
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

		return _sezDevShareDirectorAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareDirectorAddModelImpl</code>.
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

		return _sezDevShareDirectorAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareDirectorAddModelImpl</code>.
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

		return _sezDevShareDirectorAddLocalService.dynamicQuery(
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

		return _sezDevShareDirectorAddLocalService.dynamicQueryCount(
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

		return _sezDevShareDirectorAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd
			fetchSezDevShareDirectorAdd(long sezDevShareDirectorAddId) {

		return _sezDevShareDirectorAddLocalService.fetchSezDevShareDirectorAdd(
			sezDevShareDirectorAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevShareDirectorAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevShareDirectorAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevShareDirectorAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareDirectorAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevShareDirectorAdd> getSezById(long sezStatusApplicationId) {

		return _sezDevShareDirectorAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev share director add with the primary key.
	 *
	 * @param sezDevShareDirectorAddId the primary key of the sez dev share director add
	 * @return the sez dev share director add
	 * @throws PortalException if a sez dev share director add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd
				getSezDevShareDirectorAdd(long sezDevShareDirectorAddId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevShareDirectorAddLocalService.getSezDevShareDirectorAdd(
			sezDevShareDirectorAddId);
	}

	/**
	 * Returns a range of all the sez dev share director adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevShareDirectorAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev share director adds
	 * @param end the upper bound of the range of sez dev share director adds (not inclusive)
	 * @return the range of sez dev share director adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevShareDirectorAdd> getSezDevShareDirectorAdds(
				int start, int end) {

		return _sezDevShareDirectorAddLocalService.getSezDevShareDirectorAdds(
			start, end);
	}

	/**
	 * Returns the number of sez dev share director adds.
	 *
	 * @return the number of sez dev share director adds
	 */
	@Override
	public int getSezDevShareDirectorAddsCount() {
		return _sezDevShareDirectorAddLocalService.
			getSezDevShareDirectorAddsCount();
	}

	/**
	 * Updates the sez dev share director add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevShareDirectorAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevShareDirectorAdd the sez dev share director add
	 * @return the sez dev share director add that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezDevShareDirectorAdd
			updateSezDevShareDirectorAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevShareDirectorAdd sezDevShareDirectorAdd) {

		return _sezDevShareDirectorAddLocalService.updateSezDevShareDirectorAdd(
			sezDevShareDirectorAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevShareDirectorAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevShareDirectorAddLocalService getWrappedService() {
		return _sezDevShareDirectorAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevShareDirectorAddLocalService sezDevShareDirectorAddLocalService) {

		_sezDevShareDirectorAddLocalService =
			sezDevShareDirectorAddLocalService;
	}

	private SezDevShareDirectorAddLocalService
		_sezDevShareDirectorAddLocalService;

}