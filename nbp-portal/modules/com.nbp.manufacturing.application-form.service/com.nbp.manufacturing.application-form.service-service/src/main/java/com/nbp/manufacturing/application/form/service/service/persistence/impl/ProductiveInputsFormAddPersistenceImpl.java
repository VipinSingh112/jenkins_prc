/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.manufacturing.application.form.service.exception.NoSuchProductiveInputsFormAddException;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAdd;
import com.nbp.manufacturing.application.form.service.model.ProductiveInputsFormAddTable;
import com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ProductiveInputsFormAddModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormAddPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductiveInputsFormAddUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the productive inputs form add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ProductiveInputsFormAddPersistence.class)
public class ProductiveInputsFormAddPersistenceImpl
	extends BasePersistenceImpl<ProductiveInputsFormAdd>
	implements ProductiveInputsFormAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProductiveInputsFormAddUtil</code> to access the productive inputs form add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProductiveInputsFormAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMA_PIF;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_PIF;
	private FinderPath _finderPathCountBygetMA_PIF;

	/**
	 * Returns all the productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching productive inputs form adds
	 */
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId) {

		return findBygetMA_PIF(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_PIF(manufacturingApplicationId, start, end, null);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return findBygetMA_PIF(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PIF(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_PIF;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_PIF;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ProductiveInputsFormAdd> list = null;

		if (useFinderCache) {
			list = (List<ProductiveInputsFormAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ProductiveInputsFormAdd productiveInputsFormAdd : list) {
					if (manufacturingApplicationId !=
							productiveInputsFormAdd.
								getManufacturingApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORMADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PIF_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProductiveInputsFormAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ProductiveInputsFormAdd>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd findBygetMA_PIF_First(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException {

		ProductiveInputsFormAdd productiveInputsFormAdd =
			fetchBygetMA_PIF_First(
				manufacturingApplicationId, orderByComparator);

		if (productiveInputsFormAdd != null) {
			return productiveInputsFormAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchProductiveInputsFormAddException(sb.toString());
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd fetchBygetMA_PIF_First(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		List<ProductiveInputsFormAdd> list = findBygetMA_PIF(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd findBygetMA_PIF_Last(
			long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException {

		ProductiveInputsFormAdd productiveInputsFormAdd = fetchBygetMA_PIF_Last(
			manufacturingApplicationId, orderByComparator);

		if (productiveInputsFormAdd != null) {
			return productiveInputsFormAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchProductiveInputsFormAddException(sb.toString());
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd fetchBygetMA_PIF_Last(
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		int count = countBygetMA_PIF(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ProductiveInputsFormAdd> list = findBygetMA_PIF(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the productive inputs form adds before and after the current productive inputs form add in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productiveInputsFormAddId the primary key of the current productive inputs form add
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public ProductiveInputsFormAdd[] findBygetMA_PIF_PrevAndNext(
			long productiveInputsFormAddId, long manufacturingApplicationId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException {

		ProductiveInputsFormAdd productiveInputsFormAdd = findByPrimaryKey(
			productiveInputsFormAddId);

		Session session = null;

		try {
			session = openSession();

			ProductiveInputsFormAdd[] array =
				new ProductiveInputsFormAddImpl[3];

			array[0] = getBygetMA_PIF_PrevAndNext(
				session, productiveInputsFormAdd, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = productiveInputsFormAdd;

			array[2] = getBygetMA_PIF_PrevAndNext(
				session, productiveInputsFormAdd, manufacturingApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductiveInputsFormAdd getBygetMA_PIF_PrevAndNext(
		Session session, ProductiveInputsFormAdd productiveInputsFormAdd,
		long manufacturingApplicationId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORMADD_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_PIF_MANUFACTURINGAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ProductiveInputsFormAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						productiveInputsFormAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ProductiveInputsFormAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the productive inputs form adds where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_PIF(long manufacturingApplicationId) {
		for (ProductiveInputsFormAdd productiveInputsFormAdd :
				findBygetMA_PIF(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(productiveInputsFormAdd);
		}
	}

	/**
	 * Returns the number of productive inputs form adds where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching productive inputs form adds
	 */
	@Override
	public int countBygetMA_PIF(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_PIF;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRODUCTIVEINPUTSFORMADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PIF_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMA_PIF_MANUFACTURINGAPPLICATIONID_2 =
			"productiveInputsFormAdd.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_PII;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_PII;
	private FinderPath _finderPathCountBygetMA_PII;

	/**
	 * Returns all the productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @return the matching productive inputs form adds
	 */
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId) {

		return findBygetMA_PII(
			productiveInputsFormId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end) {

		return findBygetMA_PII(productiveInputsFormId, start, end, null);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return findBygetMA_PII(
			productiveInputsFormId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findBygetMA_PII(
		long productiveInputsFormId, int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_PII;
				finderArgs = new Object[] {productiveInputsFormId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_PII;
			finderArgs = new Object[] {
				productiveInputsFormId, start, end, orderByComparator
			};
		}

		List<ProductiveInputsFormAdd> list = null;

		if (useFinderCache) {
			list = (List<ProductiveInputsFormAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ProductiveInputsFormAdd productiveInputsFormAdd : list) {
					if (productiveInputsFormId !=
							productiveInputsFormAdd.
								getProductiveInputsFormId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORMADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PII_PRODUCTIVEINPUTSFORMID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProductiveInputsFormAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(productiveInputsFormId);

				list = (List<ProductiveInputsFormAdd>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd findBygetMA_PII_First(
			long productiveInputsFormId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException {

		ProductiveInputsFormAdd productiveInputsFormAdd =
			fetchBygetMA_PII_First(productiveInputsFormId, orderByComparator);

		if (productiveInputsFormAdd != null) {
			return productiveInputsFormAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("productiveInputsFormId=");
		sb.append(productiveInputsFormId);

		sb.append("}");

		throw new NoSuchProductiveInputsFormAddException(sb.toString());
	}

	/**
	 * Returns the first productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd fetchBygetMA_PII_First(
		long productiveInputsFormId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		List<ProductiveInputsFormAdd> list = findBygetMA_PII(
			productiveInputsFormId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd findBygetMA_PII_Last(
			long productiveInputsFormId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException {

		ProductiveInputsFormAdd productiveInputsFormAdd = fetchBygetMA_PII_Last(
			productiveInputsFormId, orderByComparator);

		if (productiveInputsFormAdd != null) {
			return productiveInputsFormAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("productiveInputsFormId=");
		sb.append(productiveInputsFormId);

		sb.append("}");

		throw new NoSuchProductiveInputsFormAddException(sb.toString());
	}

	/**
	 * Returns the last productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching productive inputs form add, or <code>null</code> if a matching productive inputs form add could not be found
	 */
	@Override
	public ProductiveInputsFormAdd fetchBygetMA_PII_Last(
		long productiveInputsFormId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		int count = countBygetMA_PII(productiveInputsFormId);

		if (count == 0) {
			return null;
		}

		List<ProductiveInputsFormAdd> list = findBygetMA_PII(
			productiveInputsFormId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the productive inputs form adds before and after the current productive inputs form add in the ordered set where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormAddId the primary key of the current productive inputs form add
	 * @param productiveInputsFormId the productive inputs form ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public ProductiveInputsFormAdd[] findBygetMA_PII_PrevAndNext(
			long productiveInputsFormAddId, long productiveInputsFormId,
			OrderByComparator<ProductiveInputsFormAdd> orderByComparator)
		throws NoSuchProductiveInputsFormAddException {

		ProductiveInputsFormAdd productiveInputsFormAdd = findByPrimaryKey(
			productiveInputsFormAddId);

		Session session = null;

		try {
			session = openSession();

			ProductiveInputsFormAdd[] array =
				new ProductiveInputsFormAddImpl[3];

			array[0] = getBygetMA_PII_PrevAndNext(
				session, productiveInputsFormAdd, productiveInputsFormId,
				orderByComparator, true);

			array[1] = productiveInputsFormAdd;

			array[2] = getBygetMA_PII_PrevAndNext(
				session, productiveInputsFormAdd, productiveInputsFormId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductiveInputsFormAdd getBygetMA_PII_PrevAndNext(
		Session session, ProductiveInputsFormAdd productiveInputsFormAdd,
		long productiveInputsFormId,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORMADD_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_PII_PRODUCTIVEINPUTSFORMID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ProductiveInputsFormAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(productiveInputsFormId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						productiveInputsFormAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ProductiveInputsFormAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the productive inputs form adds where productiveInputsFormId = &#63; from the database.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 */
	@Override
	public void removeBygetMA_PII(long productiveInputsFormId) {
		for (ProductiveInputsFormAdd productiveInputsFormAdd :
				findBygetMA_PII(
					productiveInputsFormId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(productiveInputsFormAdd);
		}
	}

	/**
	 * Returns the number of productive inputs form adds where productiveInputsFormId = &#63;.
	 *
	 * @param productiveInputsFormId the productive inputs form ID
	 * @return the number of matching productive inputs form adds
	 */
	@Override
	public int countBygetMA_PII(long productiveInputsFormId) {
		FinderPath finderPath = _finderPathCountBygetMA_PII;

		Object[] finderArgs = new Object[] {productiveInputsFormId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRODUCTIVEINPUTSFORMADD_WHERE);

			sb.append(_FINDER_COLUMN_GETMA_PII_PRODUCTIVEINPUTSFORMID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(productiveInputsFormId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMA_PII_PRODUCTIVEINPUTSFORMID_2 =
			"productiveInputsFormAdd.productiveInputsFormId = ?";

	public ProductiveInputsFormAddPersistenceImpl() {
		setModelClass(ProductiveInputsFormAdd.class);

		setModelImplClass(ProductiveInputsFormAddImpl.class);
		setModelPKClass(long.class);

		setTable(ProductiveInputsFormAddTable.INSTANCE);
	}

	/**
	 * Caches the productive inputs form add in the entity cache if it is enabled.
	 *
	 * @param productiveInputsFormAdd the productive inputs form add
	 */
	@Override
	public void cacheResult(ProductiveInputsFormAdd productiveInputsFormAdd) {
		entityCache.putResult(
			ProductiveInputsFormAddImpl.class,
			productiveInputsFormAdd.getPrimaryKey(), productiveInputsFormAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the productive inputs form adds in the entity cache if it is enabled.
	 *
	 * @param productiveInputsFormAdds the productive inputs form adds
	 */
	@Override
	public void cacheResult(
		List<ProductiveInputsFormAdd> productiveInputsFormAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (productiveInputsFormAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ProductiveInputsFormAdd productiveInputsFormAdd :
				productiveInputsFormAdds) {

			if (entityCache.getResult(
					ProductiveInputsFormAddImpl.class,
					productiveInputsFormAdd.getPrimaryKey()) == null) {

				cacheResult(productiveInputsFormAdd);
			}
		}
	}

	/**
	 * Clears the cache for all productive inputs form adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProductiveInputsFormAddImpl.class);

		finderCache.clearCache(ProductiveInputsFormAddImpl.class);
	}

	/**
	 * Clears the cache for the productive inputs form add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProductiveInputsFormAdd productiveInputsFormAdd) {
		entityCache.removeResult(
			ProductiveInputsFormAddImpl.class, productiveInputsFormAdd);
	}

	@Override
	public void clearCache(
		List<ProductiveInputsFormAdd> productiveInputsFormAdds) {

		for (ProductiveInputsFormAdd productiveInputsFormAdd :
				productiveInputsFormAdds) {

			entityCache.removeResult(
				ProductiveInputsFormAddImpl.class, productiveInputsFormAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProductiveInputsFormAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ProductiveInputsFormAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new productive inputs form add with the primary key. Does not add the productive inputs form add to the database.
	 *
	 * @param productiveInputsFormAddId the primary key for the new productive inputs form add
	 * @return the new productive inputs form add
	 */
	@Override
	public ProductiveInputsFormAdd create(long productiveInputsFormAddId) {
		ProductiveInputsFormAdd productiveInputsFormAdd =
			new ProductiveInputsFormAddImpl();

		productiveInputsFormAdd.setNew(true);
		productiveInputsFormAdd.setPrimaryKey(productiveInputsFormAddId);

		productiveInputsFormAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return productiveInputsFormAdd;
	}

	/**
	 * Removes the productive inputs form add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add that was removed
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public ProductiveInputsFormAdd remove(long productiveInputsFormAddId)
		throws NoSuchProductiveInputsFormAddException {

		return remove((Serializable)productiveInputsFormAddId);
	}

	/**
	 * Removes the productive inputs form add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the productive inputs form add
	 * @return the productive inputs form add that was removed
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public ProductiveInputsFormAdd remove(Serializable primaryKey)
		throws NoSuchProductiveInputsFormAddException {

		Session session = null;

		try {
			session = openSession();

			ProductiveInputsFormAdd productiveInputsFormAdd =
				(ProductiveInputsFormAdd)session.get(
					ProductiveInputsFormAddImpl.class, primaryKey);

			if (productiveInputsFormAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProductiveInputsFormAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(productiveInputsFormAdd);
		}
		catch (NoSuchProductiveInputsFormAddException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ProductiveInputsFormAdd removeImpl(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(productiveInputsFormAdd)) {
				productiveInputsFormAdd = (ProductiveInputsFormAdd)session.get(
					ProductiveInputsFormAddImpl.class,
					productiveInputsFormAdd.getPrimaryKeyObj());
			}

			if (productiveInputsFormAdd != null) {
				session.delete(productiveInputsFormAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (productiveInputsFormAdd != null) {
			clearCache(productiveInputsFormAdd);
		}

		return productiveInputsFormAdd;
	}

	@Override
	public ProductiveInputsFormAdd updateImpl(
		ProductiveInputsFormAdd productiveInputsFormAdd) {

		boolean isNew = productiveInputsFormAdd.isNew();

		if (!(productiveInputsFormAdd instanceof
				ProductiveInputsFormAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(productiveInputsFormAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					productiveInputsFormAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in productiveInputsFormAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ProductiveInputsFormAdd implementation " +
					productiveInputsFormAdd.getClass());
		}

		ProductiveInputsFormAddModelImpl productiveInputsFormAddModelImpl =
			(ProductiveInputsFormAddModelImpl)productiveInputsFormAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (productiveInputsFormAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				productiveInputsFormAdd.setCreateDate(date);
			}
			else {
				productiveInputsFormAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!productiveInputsFormAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				productiveInputsFormAdd.setModifiedDate(date);
			}
			else {
				productiveInputsFormAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(productiveInputsFormAdd);
			}
			else {
				productiveInputsFormAdd =
					(ProductiveInputsFormAdd)session.merge(
						productiveInputsFormAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProductiveInputsFormAddImpl.class, productiveInputsFormAddModelImpl,
			false, true);

		if (isNew) {
			productiveInputsFormAdd.setNew(false);
		}

		productiveInputsFormAdd.resetOriginalValues();

		return productiveInputsFormAdd;
	}

	/**
	 * Returns the productive inputs form add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the productive inputs form add
	 * @return the productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public ProductiveInputsFormAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProductiveInputsFormAddException {

		ProductiveInputsFormAdd productiveInputsFormAdd = fetchByPrimaryKey(
			primaryKey);

		if (productiveInputsFormAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProductiveInputsFormAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return productiveInputsFormAdd;
	}

	/**
	 * Returns the productive inputs form add with the primary key or throws a <code>NoSuchProductiveInputsFormAddException</code> if it could not be found.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add
	 * @throws NoSuchProductiveInputsFormAddException if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public ProductiveInputsFormAdd findByPrimaryKey(
			long productiveInputsFormAddId)
		throws NoSuchProductiveInputsFormAddException {

		return findByPrimaryKey((Serializable)productiveInputsFormAddId);
	}

	/**
	 * Returns the productive inputs form add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productiveInputsFormAddId the primary key of the productive inputs form add
	 * @return the productive inputs form add, or <code>null</code> if a productive inputs form add with the primary key could not be found
	 */
	@Override
	public ProductiveInputsFormAdd fetchByPrimaryKey(
		long productiveInputsFormAddId) {

		return fetchByPrimaryKey((Serializable)productiveInputsFormAddId);
	}

	/**
	 * Returns all the productive inputs form adds.
	 *
	 * @return the productive inputs form adds
	 */
	@Override
	public List<ProductiveInputsFormAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ProductiveInputsFormAdd> findAll(
		int start, int end,
		OrderByComparator<ProductiveInputsFormAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ProductiveInputsFormAdd> list = null;

		if (useFinderCache) {
			list = (List<ProductiveInputsFormAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PRODUCTIVEINPUTSFORMADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCTIVEINPUTSFORMADD;

				sql = sql.concat(
					ProductiveInputsFormAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ProductiveInputsFormAdd>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the productive inputs form adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProductiveInputsFormAdd productiveInputsFormAdd : findAll()) {
			remove(productiveInputsFormAdd);
		}
	}

	/**
	 * Returns the number of productive inputs form adds.
	 *
	 * @return the number of productive inputs form adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PRODUCTIVEINPUTSFORMADD);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "productiveInputsFormAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PRODUCTIVEINPUTSFORMADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProductiveInputsFormAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the productive inputs form add persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetMA_PIF = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_PIF",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_PIF = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_PIF",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_PIF = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_PIF",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_PII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_PII",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"productiveInputsFormId"}, true);

		_finderPathWithoutPaginationFindBygetMA_PII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_PII",
			new String[] {Long.class.getName()},
			new String[] {"productiveInputsFormId"}, true);

		_finderPathCountBygetMA_PII = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_PII",
			new String[] {Long.class.getName()},
			new String[] {"productiveInputsFormId"}, false);

		ProductiveInputsFormAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ProductiveInputsFormAddUtil.setPersistence(null);

		entityCache.removeCache(ProductiveInputsFormAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PRODUCTIVEINPUTSFORMADD =
		"SELECT productiveInputsFormAdd FROM ProductiveInputsFormAdd productiveInputsFormAdd";

	private static final String _SQL_SELECT_PRODUCTIVEINPUTSFORMADD_WHERE =
		"SELECT productiveInputsFormAdd FROM ProductiveInputsFormAdd productiveInputsFormAdd WHERE ";

	private static final String _SQL_COUNT_PRODUCTIVEINPUTSFORMADD =
		"SELECT COUNT(productiveInputsFormAdd) FROM ProductiveInputsFormAdd productiveInputsFormAdd";

	private static final String _SQL_COUNT_PRODUCTIVEINPUTSFORMADD_WHERE =
		"SELECT COUNT(productiveInputsFormAdd) FROM ProductiveInputsFormAdd productiveInputsFormAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"productiveInputsFormAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ProductiveInputsFormAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ProductiveInputsFormAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProductiveInputsFormAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}