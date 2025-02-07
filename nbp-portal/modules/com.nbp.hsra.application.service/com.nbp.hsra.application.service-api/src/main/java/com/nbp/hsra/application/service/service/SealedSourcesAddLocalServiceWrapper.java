/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SealedSourcesAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SealedSourcesAddLocalService
 * @generated
 */
public class SealedSourcesAddLocalServiceWrapper
	implements SealedSourcesAddLocalService,
			   ServiceWrapper<SealedSourcesAddLocalService> {

	public SealedSourcesAddLocalServiceWrapper() {
		this(null);
	}

	public SealedSourcesAddLocalServiceWrapper(
		SealedSourcesAddLocalService sealedSourcesAddLocalService) {

		_sealedSourcesAddLocalService = sealedSourcesAddLocalService;
	}

	/**
	 * Adds the sealed sources add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SealedSourcesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sealedSourcesAdd the sealed sources add
	 * @return the sealed sources add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.SealedSourcesAdd
		addSealedSourcesAdd(
			com.nbp.hsra.application.service.model.SealedSourcesAdd
				sealedSourcesAdd) {

		return _sealedSourcesAddLocalService.addSealedSourcesAdd(
			sealedSourcesAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sealedSourcesAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sealed sources add with the primary key. Does not add the sealed sources add to the database.
	 *
	 * @param sealedSourcesAddId the primary key for the new sealed sources add
	 * @return the new sealed sources add
	 */
	@Override
	public com.nbp.hsra.application.service.model.SealedSourcesAdd
		createSealedSourcesAdd(long sealedSourcesAddId) {

		return _sealedSourcesAddLocalService.createSealedSourcesAdd(
			sealedSourcesAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sealedSourcesAddLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sealed sources add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SealedSourcesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add that was removed
	 * @throws PortalException if a sealed sources add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.SealedSourcesAdd
			deleteSealedSourcesAdd(long sealedSourcesAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sealedSourcesAddLocalService.deleteSealedSourcesAdd(
			sealedSourcesAddId);
	}

	/**
	 * Deletes the sealed sources add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SealedSourcesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sealedSourcesAdd the sealed sources add
	 * @return the sealed sources add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.SealedSourcesAdd
		deleteSealedSourcesAdd(
			com.nbp.hsra.application.service.model.SealedSourcesAdd
				sealedSourcesAdd) {

		return _sealedSourcesAddLocalService.deleteSealedSourcesAdd(
			sealedSourcesAdd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sealedSourcesAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sealedSourcesAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sealedSourcesAddLocalService.dynamicQuery();
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

		return _sealedSourcesAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SealedSourcesAddModelImpl</code>.
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

		return _sealedSourcesAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SealedSourcesAddModelImpl</code>.
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

		return _sealedSourcesAddLocalService.dynamicQuery(
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

		return _sealedSourcesAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sealedSourcesAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.SealedSourcesAdd
		fetchSealedSourcesAdd(long sealedSourcesAddId) {

		return _sealedSourcesAddLocalService.fetchSealedSourcesAdd(
			sealedSourcesAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sealedSourcesAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.SealedSourcesAdd> getHsraById(
			long hsraApplicationId) {

		return _sealedSourcesAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sealedSourcesAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sealedSourcesAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sealedSourcesAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sealed sources add with the primary key.
	 *
	 * @param sealedSourcesAddId the primary key of the sealed sources add
	 * @return the sealed sources add
	 * @throws PortalException if a sealed sources add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.SealedSourcesAdd
			getSealedSourcesAdd(long sealedSourcesAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sealedSourcesAddLocalService.getSealedSourcesAdd(
			sealedSourcesAddId);
	}

	/**
	 * Returns a range of all the sealed sources adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SealedSourcesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sealed sources adds
	 * @param end the upper bound of the range of sealed sources adds (not inclusive)
	 * @return the range of sealed sources adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.SealedSourcesAdd>
			getSealedSourcesAdds(int start, int end) {

		return _sealedSourcesAddLocalService.getSealedSourcesAdds(start, end);
	}

	/**
	 * Returns the number of sealed sources adds.
	 *
	 * @return the number of sealed sources adds
	 */
	@Override
	public int getSealedSourcesAddsCount() {
		return _sealedSourcesAddLocalService.getSealedSourcesAddsCount();
	}

	/**
	 * Updates the sealed sources add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SealedSourcesAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sealedSourcesAdd the sealed sources add
	 * @return the sealed sources add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.SealedSourcesAdd
		updateSealedSourcesAdd(
			com.nbp.hsra.application.service.model.SealedSourcesAdd
				sealedSourcesAdd) {

		return _sealedSourcesAddLocalService.updateSealedSourcesAdd(
			sealedSourcesAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sealedSourcesAddLocalService.getBasePersistence();
	}

	@Override
	public SealedSourcesAddLocalService getWrappedService() {
		return _sealedSourcesAddLocalService;
	}

	@Override
	public void setWrappedService(
		SealedSourcesAddLocalService sealedSourcesAddLocalService) {

		_sealedSourcesAddLocalService = sealedSourcesAddLocalService;
	}

	private SealedSourcesAddLocalService _sealedSourcesAddLocalService;

}