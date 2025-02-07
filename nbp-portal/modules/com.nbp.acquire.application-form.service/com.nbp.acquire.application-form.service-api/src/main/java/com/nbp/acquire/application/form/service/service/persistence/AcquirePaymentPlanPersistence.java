/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquirePaymentPlanException;
import com.nbp.acquire.application.form.service.model.AcquirePaymentPlan;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire payment plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePaymentPlanUtil
 * @generated
 */
@ProviderType
public interface AcquirePaymentPlanPersistence
	extends BasePersistence<AcquirePaymentPlan> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquirePaymentPlanUtil} to access the acquire payment plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or throws a <code>NoSuchAcquirePaymentPlanException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire payment plan
	 * @throws NoSuchAcquirePaymentPlanException if a matching acquire payment plan could not be found
	 */
	public AcquirePaymentPlan findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquirePaymentPlanException;

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire payment plan, or <code>null</code> if a matching acquire payment plan could not be found
	 */
	public AcquirePaymentPlan fetchBygetAcquireById(long acquireApplicationId);

	/**
	 * Returns the acquire payment plan where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire payment plan, or <code>null</code> if a matching acquire payment plan could not be found
	 */
	public AcquirePaymentPlan fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire payment plan where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire payment plan that was removed
	 */
	public AcquirePaymentPlan removeBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquirePaymentPlanException;

	/**
	 * Returns the number of acquire payment plans where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire payment plans
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Caches the acquire payment plan in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentPlan the acquire payment plan
	 */
	public void cacheResult(AcquirePaymentPlan acquirePaymentPlan);

	/**
	 * Caches the acquire payment plans in the entity cache if it is enabled.
	 *
	 * @param acquirePaymentPlans the acquire payment plans
	 */
	public void cacheResult(
		java.util.List<AcquirePaymentPlan> acquirePaymentPlans);

	/**
	 * Creates a new acquire payment plan with the primary key. Does not add the acquire payment plan to the database.
	 *
	 * @param acquirePaymentPlanId the primary key for the new acquire payment plan
	 * @return the new acquire payment plan
	 */
	public AcquirePaymentPlan create(long acquirePaymentPlanId);

	/**
	 * Removes the acquire payment plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan that was removed
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	public AcquirePaymentPlan remove(long acquirePaymentPlanId)
		throws NoSuchAcquirePaymentPlanException;

	public AcquirePaymentPlan updateImpl(AcquirePaymentPlan acquirePaymentPlan);

	/**
	 * Returns the acquire payment plan with the primary key or throws a <code>NoSuchAcquirePaymentPlanException</code> if it could not be found.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan
	 * @throws NoSuchAcquirePaymentPlanException if a acquire payment plan with the primary key could not be found
	 */
	public AcquirePaymentPlan findByPrimaryKey(long acquirePaymentPlanId)
		throws NoSuchAcquirePaymentPlanException;

	/**
	 * Returns the acquire payment plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePaymentPlanId the primary key of the acquire payment plan
	 * @return the acquire payment plan, or <code>null</code> if a acquire payment plan with the primary key could not be found
	 */
	public AcquirePaymentPlan fetchByPrimaryKey(long acquirePaymentPlanId);

	/**
	 * Returns all the acquire payment plans.
	 *
	 * @return the acquire payment plans
	 */
	public java.util.List<AcquirePaymentPlan> findAll();

	/**
	 * Returns a range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @return the range of acquire payment plans
	 */
	public java.util.List<AcquirePaymentPlan> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire payment plans
	 */
	public java.util.List<AcquirePaymentPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquirePaymentPlan>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire payment plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePaymentPlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire payment plans
	 * @param end the upper bound of the range of acquire payment plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire payment plans
	 */
	public java.util.List<AcquirePaymentPlan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquirePaymentPlan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire payment plans from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire payment plans.
	 *
	 * @return the number of acquire payment plans
	 */
	public int countAll();

}