/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchProductiveInputsFormAddException;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the productive inputs form add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductiveInputsFormAddUtil
 * @generated
 */
@ProviderType
public interface ProductiveInputsFormAddPersistence
	extends BasePersistence<ProductiveInputsFormAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductiveInputsFormAddUtil} to access the productive inputs form add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd findBygetMA_PIF_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException;

	/**
	 * Returns the first productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd fetchBygetMA_PIF_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator);

	/**
	 * Returns the last productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd findBygetMA_PIF_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException;

	/**
	 * Returns the last productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd fetchBygetMA_PIF_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator);

	/**
	 * Returns the productive inputs form adds before and after the current productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productiveInputsFormAddId the primary key of the current productive inputs form add
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public ProductiveInputsFormAdd[] findBygetMA_PIF_PrevAndNext(
			long productiveInputsFormAddId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException;

	/**
	 * Removes all the productive inputs form adds where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_PIF(long manufacturingApplicationId);

	/**
	 * Returns the number of productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs form adds
	 */
	public int countBygetMA_PIF(long manufacturingApplicationId);

	/**
	 * Returns all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @return the matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId);

	/**
	 * Returns a range of all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end);

	/**
	 * Returns an ordered range of all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd findBygetMA_PII_First(
			long productiveInputsFormId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException;

	/**
	 * Returns the first productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd fetchBygetMA_PII_First(
		long productiveInputsFormId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator);

	/**
	 * Returns the last productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd findBygetMA_PII_Last(
			long productiveInputsFormId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException;

	/**
	 * Returns the last productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	public ProductiveInputsFormAdd fetchBygetMA_PII_Last(
		long productiveInputsFormId,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator);

	/**
	 * Returns the productive inputs form adds before and after the current productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormAddId the primary key of the current productive inputs form add
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public ProductiveInputsFormAdd[] findBygetMA_PII_PrevAndNext(
			long productiveInputsFormAddId, long productiveInputsFormId,
			com.liferay.portal.kernel.util.OrderByComparator
				<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException;

	/**
	 * Removes all the productive inputs form adds where productiveInputsFormId = &#63; from the database.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 */
	public void removeBygetMA_PII(long productiveInputsFormId);

	/**
	 * Returns the number of productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @return the number of matching productive inputs form adds
	 */
	public int countBygetMA_PII(long productiveInputsFormId);

	/**
	 * Caches the productive inputs form add in the entity cache if it is enabled.
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 */
	public void cacheResult(ProductiveInputsFormAdd productiveInputsFormAdd);

	/**
	 * Caches the productive inputs form adds in the entity cache if it is enabled.
	 *
	 * @param productiveInputsFormAdds the productive inputs form adds
	 */
	public void cacheResult(
		java.util.List<ProductiveInputsFormAdd> productiveInputsFormAdds);

	/**
	 * Creates a new productive inputs form add with the primary key. Does not add the productive inputs form add to the database.
	 *
	 * @param productiveInputsFormAddId the primary key for the new productive inputs form add
	 * @return the new productive inputs form add
	 */
	public ProductiveInputsFormAdd create(long productiveInputsFormAddId);

	/**
	 * Removes the productive inputs form add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add that was removed
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public ProductiveInputsFormAdd remove(long productiveInputsFormAddId)
		throws NoSuchProductiveInputsFormAddException;

	public ProductiveInputsFormAdd updateImpl(
		ProductiveInputsFormAdd productiveInputsFormAdd);

	/**
	 * Returns the productive inputs form add with the primary key or throws a <code>NoSuchProductiveInputsFormAddException</code> if it could not be found.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	public ProductiveInputsFormAdd findByPrimaryKey(
			long productiveInputsFormAddId)
		throws NoSuchProductiveInputsFormAddException;

	/**
	 * Returns the productive inputs form add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add, or <code>null</code> if a productive inputs form add with the primary key could not be found
	 */
	public ProductiveInputsFormAdd fetchByPrimaryKey(
		long productiveInputsFormAddId);

	/**
	 * Returns all the productive inputs form adds.
	 *
	 * @return the productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findAll();

	/**
	 * Returns a range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @return the range of productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the productive inputs form adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductiveInputsFormAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of productive inputs form adds
	 * @param end the upper bound of the range of productive inputs form adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of productive inputs form adds
	 */
	public java.util.List<ProductiveInputsFormAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the productive inputs form adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of productive inputs form adds.
	 *
	 * @return the number of productive inputs form adds
	 */
	public int countAll();

}