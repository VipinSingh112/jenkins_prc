/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevPropDevelopmentPlanException;
import com.nbp.sez.status.application.form.service.model.SezDevPropDevelopmentPlan;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez dev prop development plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevPropDevelopmentPlanUtil
 * @generated
 */
@ProviderType
public interface SezDevPropDevelopmentPlanPersistence
	extends BasePersistence<SezDevPropDevelopmentPlan> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezDevPropDevelopmentPlanUtil} to access the sez dev prop development plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevPropDevelopmentPlanException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev prop development plan
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a matching sez dev prop development plan could not be found
	 */
	public SezDevPropDevelopmentPlan findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevPropDevelopmentPlanException;

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev prop development plan, or <code>null</code> if a matching sez dev prop development plan could not be found
	 */
	public SezDevPropDevelopmentPlan fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez dev prop development plan where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev prop development plan, or <code>null</code> if a matching sez dev prop development plan could not be found
	 */
	public SezDevPropDevelopmentPlan fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez dev prop development plan where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev prop development plan that was removed
	 */
	public SezDevPropDevelopmentPlan removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevPropDevelopmentPlanException;

	/**
	 * Returns the number of sez dev prop development plans where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev prop development plans
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez dev prop development plan in the entity cache if it is enabled.
	 *
	 * @param sezDevPropDevelopmentPlan the sez dev prop development plan
	 */
	public void cacheResult(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan);

	/**
	 * Caches the sez dev prop development plans in the entity cache if it is enabled.
	 *
	 * @param sezDevPropDevelopmentPlans the sez dev prop development plans
	 */
	public void cacheResult(
		java.util.List<SezDevPropDevelopmentPlan> sezDevPropDevelopmentPlans);

	/**
	 * Creates a new sez dev prop development plan with the primary key. Does not add the sez dev prop development plan to the database.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key for the new sez dev prop development plan
	 * @return the new sez dev prop development plan
	 */
	public SezDevPropDevelopmentPlan create(long sezDevPropDevelopmentPlanId);

	/**
	 * Removes the sez dev prop development plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan that was removed
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	public SezDevPropDevelopmentPlan remove(long sezDevPropDevelopmentPlanId)
		throws NoSuchSezDevPropDevelopmentPlanException;

	public SezDevPropDevelopmentPlan updateImpl(
		SezDevPropDevelopmentPlan sezDevPropDevelopmentPlan);

	/**
	 * Returns the sez dev prop development plan with the primary key or throws a <code>NoSuchSezDevPropDevelopmentPlanException</code> if it could not be found.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan
	 * @throws NoSuchSezDevPropDevelopmentPlanException if a sez dev prop development plan with the primary key could not be found
	 */
	public SezDevPropDevelopmentPlan findByPrimaryKey(
			long sezDevPropDevelopmentPlanId)
		throws NoSuchSezDevPropDevelopmentPlanException;

	/**
	 * Returns the sez dev prop development plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevPropDevelopmentPlanId the primary key of the sez dev prop development plan
	 * @return the sez dev prop development plan, or <code>null</code> if a sez dev prop development plan with the primary key could not be found
	 */
	public SezDevPropDevelopmentPlan fetchByPrimaryKey(
		long sezDevPropDevelopmentPlanId);

	/**
	 * Returns all the sez dev prop development plans.
	 *
	 * @return the sez dev prop development plans
	 */
	public java.util.List<SezDevPropDevelopmentPlan> findAll();

	/**
	 * Returns a range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @return the range of sez dev prop development plans
	 */
	public java.util.List<SezDevPropDevelopmentPlan> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev prop development plans
	 */
	public java.util.List<SezDevPropDevelopmentPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevPropDevelopmentPlan> orderByComparator);

	/**
	 * Returns an ordered range of all the sez dev prop development plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevPropDevelopmentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev prop development plans
	 * @param end the upper bound of the range of sez dev prop development plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev prop development plans
	 */
	public java.util.List<SezDevPropDevelopmentPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezDevPropDevelopmentPlan> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez dev prop development plans from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez dev prop development plans.
	 *
	 * @return the number of sez dev prop development plans
	 */
	public int countAll();

}