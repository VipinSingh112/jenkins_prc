/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SourcesDetailAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SourcesDetailAddLocalService
 * @generated
 */
public class SourcesDetailAddLocalServiceWrapper
	implements ServiceWrapper<SourcesDetailAddLocalService>,
			   SourcesDetailAddLocalService {

	public SourcesDetailAddLocalServiceWrapper() {
		this(null);
	}

	public SourcesDetailAddLocalServiceWrapper(
		SourcesDetailAddLocalService sourcesDetailAddLocalService) {

		_sourcesDetailAddLocalService = sourcesDetailAddLocalService;
	}

	/**
	 * Adds the sources detail add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAdd the sources detail add
	 * @return the sources detail add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.SourcesDetailAdd
		addSourcesDetailAdd(
			com.nbp.hsra.application.service.model.SourcesDetailAdd
				sourcesDetailAdd) {

		return _sourcesDetailAddLocalService.addSourcesDetailAdd(
			sourcesDetailAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourcesDetailAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sources detail add with the primary key. Does not add the sources detail add to the database.
	 *
	 * @param sourcesDetailAddId the primary key for the new sources detail add
	 * @return the new sources detail add
	 */
	@Override
	public com.nbp.hsra.application.service.model.SourcesDetailAdd
		createSourcesDetailAdd(long sourcesDetailAddId) {

		return _sourcesDetailAddLocalService.createSourcesDetailAdd(
			sourcesDetailAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourcesDetailAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sources detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add that was removed
	 * @throws PortalException if a sources detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.SourcesDetailAdd
			deleteSourcesDetailAdd(long sourcesDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourcesDetailAddLocalService.deleteSourcesDetailAdd(
			sourcesDetailAddId);
	}

	/**
	 * Deletes the sources detail add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAdd the sources detail add
	 * @return the sources detail add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.SourcesDetailAdd
		deleteSourcesDetailAdd(
			com.nbp.hsra.application.service.model.SourcesDetailAdd
				sourcesDetailAdd) {

		return _sourcesDetailAddLocalService.deleteSourcesDetailAdd(
			sourcesDetailAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sourcesDetailAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sourcesDetailAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sourcesDetailAddLocalService.dynamicQuery();
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

		return _sourcesDetailAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SourcesDetailAddModelImpl</code>.
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

		return _sourcesDetailAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SourcesDetailAddModelImpl</code>.
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

		return _sourcesDetailAddLocalService.dynamicQuery(
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

		return _sourcesDetailAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sourcesDetailAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.SourcesDetailAdd
		fetchSourcesDetailAdd(long sourcesDetailAddId) {

		return _sourcesDetailAddLocalService.fetchSourcesDetailAdd(
			sourcesDetailAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sourcesDetailAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.SourcesDetailAdd> getHsraById(
			long hsraApplicationId) {

		return _sourcesDetailAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sourcesDetailAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sourcesDetailAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourcesDetailAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sources detail add with the primary key.
	 *
	 * @param sourcesDetailAddId the primary key of the sources detail add
	 * @return the sources detail add
	 * @throws PortalException if a sources detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.SourcesDetailAdd
			getSourcesDetailAdd(long sourcesDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sourcesDetailAddLocalService.getSourcesDetailAdd(
			sourcesDetailAddId);
	}

	/**
	 * Returns a range of all the sources detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SourcesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sources detail adds
	 * @param end the upper bound of the range of sources detail adds (not inclusive)
	 * @return the range of sources detail adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.SourcesDetailAdd>
			getSourcesDetailAdds(int start, int end) {

		return _sourcesDetailAddLocalService.getSourcesDetailAdds(start, end);
	}

	/**
	 * Returns the number of sources detail adds.
	 *
	 * @return the number of sources detail adds
	 */
	@Override
	public int getSourcesDetailAddsCount() {
		return _sourcesDetailAddLocalService.getSourcesDetailAddsCount();
	}

	/**
	 * Updates the sources detail add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SourcesDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sourcesDetailAdd the sources detail add
	 * @return the sources detail add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.SourcesDetailAdd
		updateSourcesDetailAdd(
			com.nbp.hsra.application.service.model.SourcesDetailAdd
				sourcesDetailAdd) {

		return _sourcesDetailAddLocalService.updateSourcesDetailAdd(
			sourcesDetailAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sourcesDetailAddLocalService.getBasePersistence();
	}

	@Override
	public SourcesDetailAddLocalService getWrappedService() {
		return _sourcesDetailAddLocalService;
	}

	@Override
	public void setWrappedService(
		SourcesDetailAddLocalService sourcesDetailAddLocalService) {

		_sourcesDetailAddLocalService = sourcesDetailAddLocalService;
	}

	private SourcesDetailAddLocalService _sourcesDetailAddLocalService;

}