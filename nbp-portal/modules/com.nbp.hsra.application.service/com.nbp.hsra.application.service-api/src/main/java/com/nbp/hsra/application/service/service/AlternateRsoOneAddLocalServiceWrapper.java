/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AlternateRsoOneAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoOneAddLocalService
 * @generated
 */
public class AlternateRsoOneAddLocalServiceWrapper
	implements AlternateRsoOneAddLocalService,
			   ServiceWrapper<AlternateRsoOneAddLocalService> {

	public AlternateRsoOneAddLocalServiceWrapper() {
		this(null);
	}

	public AlternateRsoOneAddLocalServiceWrapper(
		AlternateRsoOneAddLocalService alternateRsoOneAddLocalService) {

		_alternateRsoOneAddLocalService = alternateRsoOneAddLocalService;
	}

	/**
	 * Adds the alternate rso one add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoOneAdd the alternate rso one add
	 * @return the alternate rso one add that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoOneAdd
		addAlternateRsoOneAdd(
			com.nbp.hsra.application.service.model.AlternateRsoOneAdd
				alternateRsoOneAdd) {

		return _alternateRsoOneAddLocalService.addAlternateRsoOneAdd(
			alternateRsoOneAdd);
	}

	/**
	 * Creates a new alternate rso one add with the primary key. Does not add the alternate rso one add to the database.
	 *
	 * @param alternateRsoOneAddId the primary key for the new alternate rso one add
	 * @return the new alternate rso one add
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoOneAdd
		createAlternateRsoOneAdd(long alternateRsoOneAddId) {

		return _alternateRsoOneAddLocalService.createAlternateRsoOneAdd(
			alternateRsoOneAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoOneAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the alternate rso one add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoOneAdd the alternate rso one add
	 * @return the alternate rso one add that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoOneAdd
		deleteAlternateRsoOneAdd(
			com.nbp.hsra.application.service.model.AlternateRsoOneAdd
				alternateRsoOneAdd) {

		return _alternateRsoOneAddLocalService.deleteAlternateRsoOneAdd(
			alternateRsoOneAdd);
	}

	/**
	 * Deletes the alternate rso one add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add that was removed
	 * @throws PortalException if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoOneAdd
			deleteAlternateRsoOneAdd(long alternateRsoOneAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoOneAddLocalService.deleteAlternateRsoOneAdd(
			alternateRsoOneAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoOneAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _alternateRsoOneAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _alternateRsoOneAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _alternateRsoOneAddLocalService.dynamicQuery();
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

		return _alternateRsoOneAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AlternateRsoOneAddModelImpl</code>.
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

		return _alternateRsoOneAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AlternateRsoOneAddModelImpl</code>.
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

		return _alternateRsoOneAddLocalService.dynamicQuery(
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

		return _alternateRsoOneAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _alternateRsoOneAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoOneAdd
		fetchAlternateRsoOneAdd(long alternateRsoOneAddId) {

		return _alternateRsoOneAddLocalService.fetchAlternateRsoOneAdd(
			alternateRsoOneAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _alternateRsoOneAddLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the alternate rso one add with the primary key.
	 *
	 * @param alternateRsoOneAddId the primary key of the alternate rso one add
	 * @return the alternate rso one add
	 * @throws PortalException if a alternate rso one add with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoOneAdd
			getAlternateRsoOneAdd(long alternateRsoOneAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoOneAddLocalService.getAlternateRsoOneAdd(
			alternateRsoOneAddId);
	}

	/**
	 * Returns a range of all the alternate rso one adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.AlternateRsoOneAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of alternate rso one adds
	 * @param end the upper bound of the range of alternate rso one adds (not inclusive)
	 * @return the range of alternate rso one adds
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AlternateRsoOneAdd>
			getAlternateRsoOneAdds(int start, int end) {

		return _alternateRsoOneAddLocalService.getAlternateRsoOneAdds(
			start, end);
	}

	/**
	 * Returns the number of alternate rso one adds.
	 *
	 * @return the number of alternate rso one adds
	 */
	@Override
	public int getAlternateRsoOneAddsCount() {
		return _alternateRsoOneAddLocalService.getAlternateRsoOneAddsCount();
	}

	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.AlternateRsoOneAdd> getHsraById(
			long hsraApplicationId) {

		return _alternateRsoOneAddLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _alternateRsoOneAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _alternateRsoOneAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _alternateRsoOneAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the alternate rso one add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AlternateRsoOneAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param alternateRsoOneAdd the alternate rso one add
	 * @return the alternate rso one add that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.AlternateRsoOneAdd
		updateAlternateRsoOneAdd(
			com.nbp.hsra.application.service.model.AlternateRsoOneAdd
				alternateRsoOneAdd) {

		return _alternateRsoOneAddLocalService.updateAlternateRsoOneAdd(
			alternateRsoOneAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _alternateRsoOneAddLocalService.getBasePersistence();
	}

	@Override
	public AlternateRsoOneAddLocalService getWrappedService() {
		return _alternateRsoOneAddLocalService;
	}

	@Override
	public void setWrappedService(
		AlternateRsoOneAddLocalService alternateRsoOneAddLocalService) {

		_alternateRsoOneAddLocalService = alternateRsoOneAddLocalService;
	}

	private AlternateRsoOneAddLocalService _alternateRsoOneAddLocalService;

}