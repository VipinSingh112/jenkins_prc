/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezDevProposedProjectAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectAddLocalService
 * @generated
 */
public class SezDevProposedProjectAddLocalServiceWrapper
	implements ServiceWrapper<SezDevProposedProjectAddLocalService>,
			   SezDevProposedProjectAddLocalService {

	public SezDevProposedProjectAddLocalServiceWrapper() {
		this(null);
	}

	public SezDevProposedProjectAddLocalServiceWrapper(
		SezDevProposedProjectAddLocalService
			sezDevProposedProjectAddLocalService) {

		_sezDevProposedProjectAddLocalService =
			sezDevProposedProjectAddLocalService;
	}

	/**
	 * Adds the sez dev proposed project add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProjectAdd the sez dev proposed project add
	 * @return the sez dev proposed project add that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd addSezDevProposedProjectAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		return _sezDevProposedProjectAddLocalService.
			addSezDevProposedProjectAdd(sezDevProposedProjectAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez dev proposed project add with the primary key. Does not add the sez dev proposed project add to the database.
	 *
	 * @param sezDevProposedProjectAddId the primary key for the new sez dev proposed project add
	 * @return the new sez dev proposed project add
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd createSezDevProposedProjectAdd(
				long sezDevProposedProjectAddId) {

		return _sezDevProposedProjectAddLocalService.
			createSezDevProposedProjectAdd(sezDevProposedProjectAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez dev proposed project add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add that was removed
	 * @throws PortalException if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd deleteSezDevProposedProjectAdd(
					long sezDevProposedProjectAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectAddLocalService.
			deleteSezDevProposedProjectAdd(sezDevProposedProjectAddId);
	}

	/**
	 * Deletes the sez dev proposed project add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProjectAdd the sez dev proposed project add
	 * @return the sez dev proposed project add that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd deleteSezDevProposedProjectAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		return _sezDevProposedProjectAddLocalService.
			deleteSezDevProposedProjectAdd(sezDevProposedProjectAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezDevProposedProjectAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezDevProposedProjectAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezDevProposedProjectAddLocalService.dynamicQuery();
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

		return _sezDevProposedProjectAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectAddModelImpl</code>.
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

		return _sezDevProposedProjectAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectAddModelImpl</code>.
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

		return _sezDevProposedProjectAddLocalService.dynamicQuery(
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

		return _sezDevProposedProjectAddLocalService.dynamicQueryCount(
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

		return _sezDevProposedProjectAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd fetchSezDevProposedProjectAdd(
				long sezDevProposedProjectAddId) {

		return _sezDevProposedProjectAddLocalService.
			fetchSezDevProposedProjectAdd(sezDevProposedProjectAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezDevProposedProjectAddLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezDevProposedProjectAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezDevProposedProjectAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd> getSezById(long sezStatusApplicationId) {

		return _sezDevProposedProjectAddLocalService.getSezById(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev proposed project add with the primary key.
	 *
	 * @param sezDevProposedProjectAddId the primary key of the sez dev proposed project add
	 * @return the sez dev proposed project add
	 * @throws PortalException if a sez dev proposed project add with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd getSezDevProposedProjectAdd(
					long sezDevProposedProjectAddId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezDevProposedProjectAddLocalService.
			getSezDevProposedProjectAdd(sezDevProposedProjectAddId);
	}

	/**
	 * Returns a range of all the sez dev proposed project adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed project adds
	 * @param end the upper bound of the range of sez dev proposed project adds (not inclusive)
	 * @return the range of sez dev proposed project adds
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd> getSezDevProposedProjectAdds(
				int start, int end) {

		return _sezDevProposedProjectAddLocalService.
			getSezDevProposedProjectAdds(start, end);
	}

	/**
	 * Returns the number of sez dev proposed project adds.
	 *
	 * @return the number of sez dev proposed project adds
	 */
	@Override
	public int getSezDevProposedProjectAddsCount() {
		return _sezDevProposedProjectAddLocalService.
			getSezDevProposedProjectAddsCount();
	}

	/**
	 * Updates the sez dev proposed project add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevProposedProjectAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevProposedProjectAdd the sez dev proposed project add
	 * @return the sez dev proposed project add that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezDevProposedProjectAdd updateSezDevProposedProjectAdd(
				com.nbp.sez.status.application.form.service.model.
					SezDevProposedProjectAdd sezDevProposedProjectAdd) {

		return _sezDevProposedProjectAddLocalService.
			updateSezDevProposedProjectAdd(sezDevProposedProjectAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezDevProposedProjectAddLocalService.getBasePersistence();
	}

	@Override
	public SezDevProposedProjectAddLocalService getWrappedService() {
		return _sezDevProposedProjectAddLocalService;
	}

	@Override
	public void setWrappedService(
		SezDevProposedProjectAddLocalService
			sezDevProposedProjectAddLocalService) {

		_sezDevProposedProjectAddLocalService =
			sezDevProposedProjectAddLocalService;
	}

	private SezDevProposedProjectAddLocalService
		_sezDevProposedProjectAddLocalService;

}