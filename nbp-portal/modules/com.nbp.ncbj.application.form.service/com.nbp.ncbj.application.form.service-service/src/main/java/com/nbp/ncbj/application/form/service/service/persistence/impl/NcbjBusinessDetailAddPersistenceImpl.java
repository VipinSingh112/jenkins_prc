/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjBusinessDetailAddException;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjBusinessDetailAddTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjBusinessDetailAddUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj business detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjBusinessDetailAddPersistence.class)
public class NcbjBusinessDetailAddPersistenceImpl
	extends BasePersistenceImpl<NcbjBusinessDetailAdd>
	implements NcbjBusinessDetailAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjBusinessDetailAddUtil</code> to access the ncbj business detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjBusinessDetailAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetNCBJById;
	private FinderPath _finderPathWithoutPaginationFindBygetNCBJById;
	private FinderPath _finderPathCountBygetNCBJById;

	/**
	 * Returns all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId) {

		return findBygetNCBJById(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @return the range of matching ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end) {

		return findBygetNCBJById(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjBusinessDetailAdd> orderByComparator) {

		return findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjBusinessDetailAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNCBJById;
				finderArgs = new Object[] {ncbjApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNCBJById;
			finderArgs = new Object[] {
				ncbjApplicationId, start, end, orderByComparator
			};
		}

		List<NcbjBusinessDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjBusinessDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjBusinessDetailAdd ncbjBusinessDetailAdd : list) {
					if (ncbjApplicationId !=
							ncbjBusinessDetailAdd.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJBUSINESSDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjBusinessDetailAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjBusinessDetailAdd>)QueryUtil.list(
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
	 * Returns the first ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a matching ncbj business detail add could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjBusinessDetailAdd> orderByComparator)
		throws NoSuchNcbjBusinessDetailAddException {

		NcbjBusinessDetailAdd ncbjBusinessDetailAdd = fetchBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);

		if (ncbjBusinessDetailAdd != null) {
			return ncbjBusinessDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjBusinessDetailAddException(sb.toString());
	}

	/**
	 * Returns the first ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj business detail add, or <code>null</code> if a matching ncbj business detail add could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjBusinessDetailAdd> orderByComparator) {

		List<NcbjBusinessDetailAdd> list = findBygetNCBJById(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a matching ncbj business detail add could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjBusinessDetailAdd> orderByComparator)
		throws NoSuchNcbjBusinessDetailAddException {

		NcbjBusinessDetailAdd ncbjBusinessDetailAdd = fetchBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);

		if (ncbjBusinessDetailAdd != null) {
			return ncbjBusinessDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjBusinessDetailAddException(sb.toString());
	}

	/**
	 * Returns the last ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj business detail add, or <code>null</code> if a matching ncbj business detail add could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjBusinessDetailAdd> orderByComparator) {

		int count = countBygetNCBJById(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjBusinessDetailAdd> list = findBygetNCBJById(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj business detail adds before and after the current ncbj business detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the current ncbj business detail add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjBusinessDetailAddId, long ncbjApplicationId,
			OrderByComparator<NcbjBusinessDetailAdd> orderByComparator)
		throws NoSuchNcbjBusinessDetailAddException {

		NcbjBusinessDetailAdd ncbjBusinessDetailAdd = findByPrimaryKey(
			ncbjBusinessDetailAddId);

		Session session = null;

		try {
			session = openSession();

			NcbjBusinessDetailAdd[] array = new NcbjBusinessDetailAddImpl[3];

			array[0] = getBygetNCBJById_PrevAndNext(
				session, ncbjBusinessDetailAdd, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjBusinessDetailAdd;

			array[2] = getBygetNCBJById_PrevAndNext(
				session, ncbjBusinessDetailAdd, ncbjApplicationId,
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

	protected NcbjBusinessDetailAdd getBygetNCBJById_PrevAndNext(
		Session session, NcbjBusinessDetailAdd ncbjBusinessDetailAdd,
		long ncbjApplicationId,
		OrderByComparator<NcbjBusinessDetailAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJBUSINESSDETAILADD_WHERE);

		sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

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
			sb.append(NcbjBusinessDetailAddModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(ncbjApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncbjBusinessDetailAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjBusinessDetailAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj business detail adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNCBJById(long ncbjApplicationId) {
		for (NcbjBusinessDetailAdd ncbjBusinessDetailAdd :
				findBygetNCBJById(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjBusinessDetailAdd);
		}
	}

	/**
	 * Returns the number of ncbj business detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj business detail adds
	 */
	@Override
	public int countBygetNCBJById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJBUSINESSDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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

	private static final String _FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2 =
		"ncbjBusinessDetailAdd.ncbjApplicationId = ?";

	public NcbjBusinessDetailAddPersistenceImpl() {
		setModelClass(NcbjBusinessDetailAdd.class);

		setModelImplClass(NcbjBusinessDetailAddImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjBusinessDetailAddTable.INSTANCE);
	}

	/**
	 * Caches the ncbj business detail add in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetailAdd the ncbj business detail add
	 */
	@Override
	public void cacheResult(NcbjBusinessDetailAdd ncbjBusinessDetailAdd) {
		entityCache.putResult(
			NcbjBusinessDetailAddImpl.class,
			ncbjBusinessDetailAdd.getPrimaryKey(), ncbjBusinessDetailAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj business detail adds in the entity cache if it is enabled.
	 *
	 * @param ncbjBusinessDetailAdds the ncbj business detail adds
	 */
	@Override
	public void cacheResult(
		List<NcbjBusinessDetailAdd> ncbjBusinessDetailAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjBusinessDetailAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjBusinessDetailAdd ncbjBusinessDetailAdd :
				ncbjBusinessDetailAdds) {

			if (entityCache.getResult(
					NcbjBusinessDetailAddImpl.class,
					ncbjBusinessDetailAdd.getPrimaryKey()) == null) {

				cacheResult(ncbjBusinessDetailAdd);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj business detail adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjBusinessDetailAddImpl.class);

		finderCache.clearCache(NcbjBusinessDetailAddImpl.class);
	}

	/**
	 * Clears the cache for the ncbj business detail add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjBusinessDetailAdd ncbjBusinessDetailAdd) {
		entityCache.removeResult(
			NcbjBusinessDetailAddImpl.class, ncbjBusinessDetailAdd);
	}

	@Override
	public void clearCache(List<NcbjBusinessDetailAdd> ncbjBusinessDetailAdds) {
		for (NcbjBusinessDetailAdd ncbjBusinessDetailAdd :
				ncbjBusinessDetailAdds) {

			entityCache.removeResult(
				NcbjBusinessDetailAddImpl.class, ncbjBusinessDetailAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjBusinessDetailAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjBusinessDetailAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new ncbj business detail add with the primary key. Does not add the ncbj business detail add to the database.
	 *
	 * @param ncbjBusinessDetailAddId the primary key for the new ncbj business detail add
	 * @return the new ncbj business detail add
	 */
	@Override
	public NcbjBusinessDetailAdd create(long ncbjBusinessDetailAddId) {
		NcbjBusinessDetailAdd ncbjBusinessDetailAdd =
			new NcbjBusinessDetailAddImpl();

		ncbjBusinessDetailAdd.setNew(true);
		ncbjBusinessDetailAdd.setPrimaryKey(ncbjBusinessDetailAddId);

		ncbjBusinessDetailAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjBusinessDetailAdd;
	}

	/**
	 * Removes the ncbj business detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add that was removed
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd remove(long ncbjBusinessDetailAddId)
		throws NoSuchNcbjBusinessDetailAddException {

		return remove((Serializable)ncbjBusinessDetailAddId);
	}

	/**
	 * Removes the ncbj business detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj business detail add
	 * @return the ncbj business detail add that was removed
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd remove(Serializable primaryKey)
		throws NoSuchNcbjBusinessDetailAddException {

		Session session = null;

		try {
			session = openSession();

			NcbjBusinessDetailAdd ncbjBusinessDetailAdd =
				(NcbjBusinessDetailAdd)session.get(
					NcbjBusinessDetailAddImpl.class, primaryKey);

			if (ncbjBusinessDetailAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjBusinessDetailAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjBusinessDetailAdd);
		}
		catch (NoSuchNcbjBusinessDetailAddException noSuchEntityException) {
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
	protected NcbjBusinessDetailAdd removeImpl(
		NcbjBusinessDetailAdd ncbjBusinessDetailAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjBusinessDetailAdd)) {
				ncbjBusinessDetailAdd = (NcbjBusinessDetailAdd)session.get(
					NcbjBusinessDetailAddImpl.class,
					ncbjBusinessDetailAdd.getPrimaryKeyObj());
			}

			if (ncbjBusinessDetailAdd != null) {
				session.delete(ncbjBusinessDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjBusinessDetailAdd != null) {
			clearCache(ncbjBusinessDetailAdd);
		}

		return ncbjBusinessDetailAdd;
	}

	@Override
	public NcbjBusinessDetailAdd updateImpl(
		NcbjBusinessDetailAdd ncbjBusinessDetailAdd) {

		boolean isNew = ncbjBusinessDetailAdd.isNew();

		if (!(ncbjBusinessDetailAdd instanceof
				NcbjBusinessDetailAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjBusinessDetailAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjBusinessDetailAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjBusinessDetailAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjBusinessDetailAdd implementation " +
					ncbjBusinessDetailAdd.getClass());
		}

		NcbjBusinessDetailAddModelImpl ncbjBusinessDetailAddModelImpl =
			(NcbjBusinessDetailAddModelImpl)ncbjBusinessDetailAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjBusinessDetailAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjBusinessDetailAdd.setCreateDate(date);
			}
			else {
				ncbjBusinessDetailAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjBusinessDetailAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjBusinessDetailAdd.setModifiedDate(date);
			}
			else {
				ncbjBusinessDetailAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjBusinessDetailAdd);
			}
			else {
				ncbjBusinessDetailAdd = (NcbjBusinessDetailAdd)session.merge(
					ncbjBusinessDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjBusinessDetailAddImpl.class, ncbjBusinessDetailAddModelImpl,
			false, true);

		if (isNew) {
			ncbjBusinessDetailAdd.setNew(false);
		}

		ncbjBusinessDetailAdd.resetOriginalValues();

		return ncbjBusinessDetailAdd;
	}

	/**
	 * Returns the ncbj business detail add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj business detail add
	 * @return the ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjBusinessDetailAddException {

		NcbjBusinessDetailAdd ncbjBusinessDetailAdd = fetchByPrimaryKey(
			primaryKey);

		if (ncbjBusinessDetailAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjBusinessDetailAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjBusinessDetailAdd;
	}

	/**
	 * Returns the ncbj business detail add with the primary key or throws a <code>NoSuchNcbjBusinessDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add
	 * @throws NoSuchNcbjBusinessDetailAddException if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd findByPrimaryKey(long ncbjBusinessDetailAddId)
		throws NoSuchNcbjBusinessDetailAddException {

		return findByPrimaryKey((Serializable)ncbjBusinessDetailAddId);
	}

	/**
	 * Returns the ncbj business detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjBusinessDetailAddId the primary key of the ncbj business detail add
	 * @return the ncbj business detail add, or <code>null</code> if a ncbj business detail add with the primary key could not be found
	 */
	@Override
	public NcbjBusinessDetailAdd fetchByPrimaryKey(
		long ncbjBusinessDetailAddId) {

		return fetchByPrimaryKey((Serializable)ncbjBusinessDetailAddId);
	}

	/**
	 * Returns all the ncbj business detail adds.
	 *
	 * @return the ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj business detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @return the range of ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj business detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjBusinessDetailAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj business detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjBusinessDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business detail adds
	 * @param end the upper bound of the range of ncbj business detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj business detail adds
	 */
	@Override
	public List<NcbjBusinessDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjBusinessDetailAdd> orderByComparator,
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

		List<NcbjBusinessDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjBusinessDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJBUSINESSDETAILADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJBUSINESSDETAILADD;

				sql = sql.concat(NcbjBusinessDetailAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjBusinessDetailAdd>)QueryUtil.list(
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
	 * Removes all the ncbj business detail adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjBusinessDetailAdd ncbjBusinessDetailAdd : findAll()) {
			remove(ncbjBusinessDetailAdd);
		}
	}

	/**
	 * Returns the number of ncbj business detail adds.
	 *
	 * @return the number of ncbj business detail adds
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
					_SQL_COUNT_NCBJBUSINESSDETAILADD);

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
		return "ncbjBusinessDetailAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJBUSINESSDETAILADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjBusinessDetailAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj business detail add persistence.
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

		_finderPathWithPaginationFindBygetNCBJById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNCBJById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNCBJById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNCBJById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjBusinessDetailAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjBusinessDetailAddUtil.setPersistence(null);

		entityCache.removeCache(NcbjBusinessDetailAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJBUSINESSDETAILADD =
		"SELECT ncbjBusinessDetailAdd FROM NcbjBusinessDetailAdd ncbjBusinessDetailAdd";

	private static final String _SQL_SELECT_NCBJBUSINESSDETAILADD_WHERE =
		"SELECT ncbjBusinessDetailAdd FROM NcbjBusinessDetailAdd ncbjBusinessDetailAdd WHERE ";

	private static final String _SQL_COUNT_NCBJBUSINESSDETAILADD =
		"SELECT COUNT(ncbjBusinessDetailAdd) FROM NcbjBusinessDetailAdd ncbjBusinessDetailAdd";

	private static final String _SQL_COUNT_NCBJBUSINESSDETAILADD_WHERE =
		"SELECT COUNT(ncbjBusinessDetailAdd) FROM NcbjBusinessDetailAdd ncbjBusinessDetailAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjBusinessDetailAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjBusinessDetailAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjBusinessDetailAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjBusinessDetailAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}