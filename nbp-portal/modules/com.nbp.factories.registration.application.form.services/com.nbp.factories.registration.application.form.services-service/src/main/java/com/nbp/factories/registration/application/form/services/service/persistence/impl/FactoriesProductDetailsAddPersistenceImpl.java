/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence.impl;

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

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesProductDetailsAddException;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;
import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAddTable;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddImpl;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesProductDetailsAddModelImpl;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProductDetailsAddPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProductDetailsAddUtil;
import com.nbp.factories.registration.application.form.services.service.persistence.impl.constants.FACTORIESPersistenceConstants;

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
 * The persistence implementation for the factories product details add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesProductDetailsAddPersistence.class)
public class FactoriesProductDetailsAddPersistenceImpl
	extends BasePersistenceImpl<FactoriesProductDetailsAdd>
	implements FactoriesProductDetailsAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesProductDetailsAddUtil</code> to access the factories product details add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesProductDetailsAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetFactoriesById;
	private FinderPath _finderPathWithoutPaginationFindBygetFactoriesById;
	private FinderPath _finderPathCountBygetFactoriesById;

	/**
	 * Returns all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId) {

		return findBygetFactoriesById(
			factoriesApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of matching factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end) {

		return findBygetFactoriesById(factoriesApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		return findBygetFactoriesById(
			factoriesApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFactoriesById;
				finderArgs = new Object[] {factoriesApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFactoriesById;
			finderArgs = new Object[] {
				factoriesApplicationId, start, end, orderByComparator
			};
		}

		List<FactoriesProductDetailsAdd> list = null;

		if (useFinderCache) {
			list = (List<FactoriesProductDetailsAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesProductDetailsAdd factoriesProductDetailsAdd :
						list) {

					if (factoriesApplicationId !=
							factoriesProductDetailsAdd.
								getFactoriesApplicationId()) {

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

			sb.append(_SQL_SELECT_FACTORIESPRODUCTDETAILSADD_WHERE);

			sb.append(_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesProductDetailsAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

				list = (List<FactoriesProductDetailsAdd>)QueryUtil.list(
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
	 * Returns the first factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a matching factories product details add could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd findBygetFactoriesById_First(
			long factoriesApplicationId,
			OrderByComparator<FactoriesProductDetailsAdd> orderByComparator)
		throws NoSuchFactoriesProductDetailsAddException {

		FactoriesProductDetailsAdd factoriesProductDetailsAdd =
			fetchBygetFactoriesById_First(
				factoriesApplicationId, orderByComparator);

		if (factoriesProductDetailsAdd != null) {
			return factoriesProductDetailsAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("factoriesApplicationId=");
		sb.append(factoriesApplicationId);

		sb.append("}");

		throw new NoSuchFactoriesProductDetailsAddException(sb.toString());
	}

	/**
	 * Returns the first factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories product details add, or <code>null</code> if a matching factories product details add could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd fetchBygetFactoriesById_First(
		long factoriesApplicationId,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		List<FactoriesProductDetailsAdd> list = findBygetFactoriesById(
			factoriesApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a matching factories product details add could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd findBygetFactoriesById_Last(
			long factoriesApplicationId,
			OrderByComparator<FactoriesProductDetailsAdd> orderByComparator)
		throws NoSuchFactoriesProductDetailsAddException {

		FactoriesProductDetailsAdd factoriesProductDetailsAdd =
			fetchBygetFactoriesById_Last(
				factoriesApplicationId, orderByComparator);

		if (factoriesProductDetailsAdd != null) {
			return factoriesProductDetailsAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("factoriesApplicationId=");
		sb.append(factoriesApplicationId);

		sb.append("}");

		throw new NoSuchFactoriesProductDetailsAddException(sb.toString());
	}

	/**
	 * Returns the last factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories product details add, or <code>null</code> if a matching factories product details add could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd fetchBygetFactoriesById_Last(
		long factoriesApplicationId,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		int count = countBygetFactoriesById(factoriesApplicationId);

		if (count == 0) {
			return null;
		}

		List<FactoriesProductDetailsAdd> list = findBygetFactoriesById(
			factoriesApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories product details adds before and after the current factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the current factories product details add
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd[] findBygetFactoriesById_PrevAndNext(
			long factoriesProductDetailsAddId, long factoriesApplicationId,
			OrderByComparator<FactoriesProductDetailsAdd> orderByComparator)
		throws NoSuchFactoriesProductDetailsAddException {

		FactoriesProductDetailsAdd factoriesProductDetailsAdd =
			findByPrimaryKey(factoriesProductDetailsAddId);

		Session session = null;

		try {
			session = openSession();

			FactoriesProductDetailsAdd[] array =
				new FactoriesProductDetailsAddImpl[3];

			array[0] = getBygetFactoriesById_PrevAndNext(
				session, factoriesProductDetailsAdd, factoriesApplicationId,
				orderByComparator, true);

			array[1] = factoriesProductDetailsAdd;

			array[2] = getBygetFactoriesById_PrevAndNext(
				session, factoriesProductDetailsAdd, factoriesApplicationId,
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

	protected FactoriesProductDetailsAdd getBygetFactoriesById_PrevAndNext(
		Session session, FactoriesProductDetailsAdd factoriesProductDetailsAdd,
		long factoriesApplicationId,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESPRODUCTDETAILSADD_WHERE);

		sb.append(_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2);

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
			sb.append(FactoriesProductDetailsAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(factoriesApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						factoriesProductDetailsAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesProductDetailsAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories product details adds where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 */
	@Override
	public void removeBygetFactoriesById(long factoriesApplicationId) {
		for (FactoriesProductDetailsAdd factoriesProductDetailsAdd :
				findBygetFactoriesById(
					factoriesApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(factoriesProductDetailsAdd);
		}
	}

	/**
	 * Returns the number of factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories product details adds
	 */
	@Override
	public int countBygetFactoriesById(long factoriesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFactoriesById;

		Object[] finderArgs = new Object[] {factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESPRODUCTDETAILSADD_WHERE);

			sb.append(_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

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
		_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2 =
			"factoriesProductDetailsAdd.factoriesApplicationId = ?";

	public FactoriesProductDetailsAddPersistenceImpl() {
		setModelClass(FactoriesProductDetailsAdd.class);

		setModelImplClass(FactoriesProductDetailsAddImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesProductDetailsAddTable.INSTANCE);
	}

	/**
	 * Caches the factories product details add in the entity cache if it is enabled.
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 */
	@Override
	public void cacheResult(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		entityCache.putResult(
			FactoriesProductDetailsAddImpl.class,
			factoriesProductDetailsAdd.getPrimaryKey(),
			factoriesProductDetailsAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories product details adds in the entity cache if it is enabled.
	 *
	 * @param factoriesProductDetailsAdds the factories product details adds
	 */
	@Override
	public void cacheResult(
		List<FactoriesProductDetailsAdd> factoriesProductDetailsAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesProductDetailsAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesProductDetailsAdd factoriesProductDetailsAdd :
				factoriesProductDetailsAdds) {

			if (entityCache.getResult(
					FactoriesProductDetailsAddImpl.class,
					factoriesProductDetailsAdd.getPrimaryKey()) == null) {

				cacheResult(factoriesProductDetailsAdd);
			}
		}
	}

	/**
	 * Clears the cache for all factories product details adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesProductDetailsAddImpl.class);

		finderCache.clearCache(FactoriesProductDetailsAddImpl.class);
	}

	/**
	 * Clears the cache for the factories product details add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		entityCache.removeResult(
			FactoriesProductDetailsAddImpl.class, factoriesProductDetailsAdd);
	}

	@Override
	public void clearCache(
		List<FactoriesProductDetailsAdd> factoriesProductDetailsAdds) {

		for (FactoriesProductDetailsAdd factoriesProductDetailsAdd :
				factoriesProductDetailsAdds) {

			entityCache.removeResult(
				FactoriesProductDetailsAddImpl.class,
				factoriesProductDetailsAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesProductDetailsAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesProductDetailsAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new factories product details add with the primary key. Does not add the factories product details add to the database.
	 *
	 * @param factoriesProductDetailsAddId the primary key for the new factories product details add
	 * @return the new factories product details add
	 */
	@Override
	public FactoriesProductDetailsAdd create(
		long factoriesProductDetailsAddId) {

		FactoriesProductDetailsAdd factoriesProductDetailsAdd =
			new FactoriesProductDetailsAddImpl();

		factoriesProductDetailsAdd.setNew(true);
		factoriesProductDetailsAdd.setPrimaryKey(factoriesProductDetailsAddId);

		factoriesProductDetailsAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesProductDetailsAdd;
	}

	/**
	 * Removes the factories product details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add that was removed
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd remove(long factoriesProductDetailsAddId)
		throws NoSuchFactoriesProductDetailsAddException {

		return remove((Serializable)factoriesProductDetailsAddId);
	}

	/**
	 * Removes the factories product details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories product details add
	 * @return the factories product details add that was removed
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd remove(Serializable primaryKey)
		throws NoSuchFactoriesProductDetailsAddException {

		Session session = null;

		try {
			session = openSession();

			FactoriesProductDetailsAdd factoriesProductDetailsAdd =
				(FactoriesProductDetailsAdd)session.get(
					FactoriesProductDetailsAddImpl.class, primaryKey);

			if (factoriesProductDetailsAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesProductDetailsAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesProductDetailsAdd);
		}
		catch (NoSuchFactoriesProductDetailsAddException
					noSuchEntityException) {

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
	protected FactoriesProductDetailsAdd removeImpl(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesProductDetailsAdd)) {
				factoriesProductDetailsAdd =
					(FactoriesProductDetailsAdd)session.get(
						FactoriesProductDetailsAddImpl.class,
						factoriesProductDetailsAdd.getPrimaryKeyObj());
			}

			if (factoriesProductDetailsAdd != null) {
				session.delete(factoriesProductDetailsAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesProductDetailsAdd != null) {
			clearCache(factoriesProductDetailsAdd);
		}

		return factoriesProductDetailsAdd;
	}

	@Override
	public FactoriesProductDetailsAdd updateImpl(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		boolean isNew = factoriesProductDetailsAdd.isNew();

		if (!(factoriesProductDetailsAdd instanceof
				FactoriesProductDetailsAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoriesProductDetailsAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesProductDetailsAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesProductDetailsAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesProductDetailsAdd implementation " +
					factoriesProductDetailsAdd.getClass());
		}

		FactoriesProductDetailsAddModelImpl
			factoriesProductDetailsAddModelImpl =
				(FactoriesProductDetailsAddModelImpl)factoriesProductDetailsAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesProductDetailsAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesProductDetailsAdd.setCreateDate(date);
			}
			else {
				factoriesProductDetailsAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesProductDetailsAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesProductDetailsAdd.setModifiedDate(date);
			}
			else {
				factoriesProductDetailsAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesProductDetailsAdd);
			}
			else {
				factoriesProductDetailsAdd =
					(FactoriesProductDetailsAdd)session.merge(
						factoriesProductDetailsAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesProductDetailsAddImpl.class,
			factoriesProductDetailsAddModelImpl, false, true);

		if (isNew) {
			factoriesProductDetailsAdd.setNew(false);
		}

		factoriesProductDetailsAdd.resetOriginalValues();

		return factoriesProductDetailsAdd;
	}

	/**
	 * Returns the factories product details add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories product details add
	 * @return the factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoriesProductDetailsAddException {

		FactoriesProductDetailsAdd factoriesProductDetailsAdd =
			fetchByPrimaryKey(primaryKey);

		if (factoriesProductDetailsAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesProductDetailsAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesProductDetailsAdd;
	}

	/**
	 * Returns the factories product details add with the primary key or throws a <code>NoSuchFactoriesProductDetailsAddException</code> if it could not be found.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd findByPrimaryKey(
			long factoriesProductDetailsAddId)
		throws NoSuchFactoriesProductDetailsAddException {

		return findByPrimaryKey((Serializable)factoriesProductDetailsAddId);
	}

	/**
	 * Returns the factories product details add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add, or <code>null</code> if a factories product details add with the primary key could not be found
	 */
	@Override
	public FactoriesProductDetailsAdd fetchByPrimaryKey(
		long factoriesProductDetailsAddId) {

		return fetchByPrimaryKey((Serializable)factoriesProductDetailsAddId);
	}

	/**
	 * Returns all the factories product details adds.
	 *
	 * @return the factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findAll(
		int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories product details adds
	 */
	@Override
	public List<FactoriesProductDetailsAdd> findAll(
		int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator,
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

		List<FactoriesProductDetailsAdd> list = null;

		if (useFinderCache) {
			list = (List<FactoriesProductDetailsAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESPRODUCTDETAILSADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESPRODUCTDETAILSADD;

				sql = sql.concat(
					FactoriesProductDetailsAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesProductDetailsAdd>)QueryUtil.list(
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
	 * Removes all the factories product details adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesProductDetailsAdd factoriesProductDetailsAdd :
				findAll()) {

			remove(factoriesProductDetailsAdd);
		}
	}

	/**
	 * Returns the number of factories product details adds.
	 *
	 * @return the number of factories product details adds
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
					_SQL_COUNT_FACTORIESPRODUCTDETAILSADD);

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
		return "factoriesProductDetailsAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESPRODUCTDETAILSADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesProductDetailsAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories product details add persistence.
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

		_finderPathWithPaginationFindBygetFactoriesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFactoriesById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFactoriesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFactoriesById",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathCountBygetFactoriesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesById", new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, false);

		FactoriesProductDetailsAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesProductDetailsAddUtil.setPersistence(null);

		entityCache.removeCache(FactoriesProductDetailsAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESPRODUCTDETAILSADD =
		"SELECT factoriesProductDetailsAdd FROM FactoriesProductDetailsAdd factoriesProductDetailsAdd";

	private static final String _SQL_SELECT_FACTORIESPRODUCTDETAILSADD_WHERE =
		"SELECT factoriesProductDetailsAdd FROM FactoriesProductDetailsAdd factoriesProductDetailsAdd WHERE ";

	private static final String _SQL_COUNT_FACTORIESPRODUCTDETAILSADD =
		"SELECT COUNT(factoriesProductDetailsAdd) FROM FactoriesProductDetailsAdd factoriesProductDetailsAdd";

	private static final String _SQL_COUNT_FACTORIESPRODUCTDETAILSADD_WHERE =
		"SELECT COUNT(factoriesProductDetailsAdd) FROM FactoriesProductDetailsAdd factoriesProductDetailsAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesProductDetailsAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesProductDetailsAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesProductDetailsAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesProductDetailsAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}