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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCompanyDetailAddException;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAddTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailAddImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailAddModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailAddUtil;
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
 * The persistence implementation for the ncbj company detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjCompanyDetailAddPersistence.class)
public class NcbjCompanyDetailAddPersistenceImpl
	extends BasePersistenceImpl<NcbjCompanyDetailAdd>
	implements NcbjCompanyDetailAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjCompanyDetailAddUtil</code> to access the ncbj company detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjCompanyDetailAddImpl.class.getName();

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
	 * Returns all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId) {

		return findBygetNCBJById(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @return the range of matching ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end) {

		return findBygetNCBJById(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		return findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator,
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

		List<NcbjCompanyDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjCompanyDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjCompanyDetailAdd ncbjCompanyDetailAdd : list) {
					if (ncbjApplicationId !=
							ncbjCompanyDetailAdd.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJCOMPANYDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjCompanyDetailAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjCompanyDetailAdd>)QueryUtil.list(
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
	 * Returns the first ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a matching ncbj company detail add could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailAdd> orderByComparator)
		throws NoSuchNcbjCompanyDetailAddException {

		NcbjCompanyDetailAdd ncbjCompanyDetailAdd = fetchBygetNCBJById_First(
			ncbjApplicationId, orderByComparator);

		if (ncbjCompanyDetailAdd != null) {
			return ncbjCompanyDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjCompanyDetailAddException(sb.toString());
	}

	/**
	 * Returns the first ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail add, or <code>null</code> if a matching ncbj company detail add could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		List<NcbjCompanyDetailAdd> list = findBygetNCBJById(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a matching ncbj company detail add could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailAdd> orderByComparator)
		throws NoSuchNcbjCompanyDetailAddException {

		NcbjCompanyDetailAdd ncbjCompanyDetailAdd = fetchBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);

		if (ncbjCompanyDetailAdd != null) {
			return ncbjCompanyDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjCompanyDetailAddException(sb.toString());
	}

	/**
	 * Returns the last ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail add, or <code>null</code> if a matching ncbj company detail add could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		int count = countBygetNCBJById(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjCompanyDetailAdd> list = findBygetNCBJById(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj company detail adds before and after the current ncbj company detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the current ncbj company detail add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjCompanyDetailAddId, long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailAdd> orderByComparator)
		throws NoSuchNcbjCompanyDetailAddException {

		NcbjCompanyDetailAdd ncbjCompanyDetailAdd = findByPrimaryKey(
			ncbjCompanyDetailAddId);

		Session session = null;

		try {
			session = openSession();

			NcbjCompanyDetailAdd[] array = new NcbjCompanyDetailAddImpl[3];

			array[0] = getBygetNCBJById_PrevAndNext(
				session, ncbjCompanyDetailAdd, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjCompanyDetailAdd;

			array[2] = getBygetNCBJById_PrevAndNext(
				session, ncbjCompanyDetailAdd, ncbjApplicationId,
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

	protected NcbjCompanyDetailAdd getBygetNCBJById_PrevAndNext(
		Session session, NcbjCompanyDetailAdd ncbjCompanyDetailAdd,
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJCOMPANYDETAILADD_WHERE);

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
			sb.append(NcbjCompanyDetailAddModelImpl.ORDER_BY_JPQL);
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
						ncbjCompanyDetailAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjCompanyDetailAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj company detail adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNCBJById(long ncbjApplicationId) {
		for (NcbjCompanyDetailAdd ncbjCompanyDetailAdd :
				findBygetNCBJById(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjCompanyDetailAdd);
		}
	}

	/**
	 * Returns the number of ncbj company detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail adds
	 */
	@Override
	public int countBygetNCBJById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCOMPANYDETAILADD_WHERE);

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
		"ncbjCompanyDetailAdd.ncbjApplicationId = ?";

	public NcbjCompanyDetailAddPersistenceImpl() {
		setModelClass(NcbjCompanyDetailAdd.class);

		setModelImplClass(NcbjCompanyDetailAddImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjCompanyDetailAddTable.INSTANCE);
	}

	/**
	 * Caches the ncbj company detail add in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailAdd the ncbj company detail add
	 */
	@Override
	public void cacheResult(NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {
		entityCache.putResult(
			NcbjCompanyDetailAddImpl.class,
			ncbjCompanyDetailAdd.getPrimaryKey(), ncbjCompanyDetailAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj company detail adds in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailAdds the ncbj company detail adds
	 */
	@Override
	public void cacheResult(List<NcbjCompanyDetailAdd> ncbjCompanyDetailAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjCompanyDetailAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjCompanyDetailAdd ncbjCompanyDetailAdd :
				ncbjCompanyDetailAdds) {

			if (entityCache.getResult(
					NcbjCompanyDetailAddImpl.class,
					ncbjCompanyDetailAdd.getPrimaryKey()) == null) {

				cacheResult(ncbjCompanyDetailAdd);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj company detail adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjCompanyDetailAddImpl.class);

		finderCache.clearCache(NcbjCompanyDetailAddImpl.class);
	}

	/**
	 * Clears the cache for the ncbj company detail add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {
		entityCache.removeResult(
			NcbjCompanyDetailAddImpl.class, ncbjCompanyDetailAdd);
	}

	@Override
	public void clearCache(List<NcbjCompanyDetailAdd> ncbjCompanyDetailAdds) {
		for (NcbjCompanyDetailAdd ncbjCompanyDetailAdd :
				ncbjCompanyDetailAdds) {

			entityCache.removeResult(
				NcbjCompanyDetailAddImpl.class, ncbjCompanyDetailAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjCompanyDetailAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjCompanyDetailAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new ncbj company detail add with the primary key. Does not add the ncbj company detail add to the database.
	 *
	 * @param ncbjCompanyDetailAddId the primary key for the new ncbj company detail add
	 * @return the new ncbj company detail add
	 */
	@Override
	public NcbjCompanyDetailAdd create(long ncbjCompanyDetailAddId) {
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd =
			new NcbjCompanyDetailAddImpl();

		ncbjCompanyDetailAdd.setNew(true);
		ncbjCompanyDetailAdd.setPrimaryKey(ncbjCompanyDetailAddId);

		ncbjCompanyDetailAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjCompanyDetailAdd;
	}

	/**
	 * Removes the ncbj company detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add that was removed
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd remove(long ncbjCompanyDetailAddId)
		throws NoSuchNcbjCompanyDetailAddException {

		return remove((Serializable)ncbjCompanyDetailAddId);
	}

	/**
	 * Removes the ncbj company detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj company detail add
	 * @return the ncbj company detail add that was removed
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd remove(Serializable primaryKey)
		throws NoSuchNcbjCompanyDetailAddException {

		Session session = null;

		try {
			session = openSession();

			NcbjCompanyDetailAdd ncbjCompanyDetailAdd =
				(NcbjCompanyDetailAdd)session.get(
					NcbjCompanyDetailAddImpl.class, primaryKey);

			if (ncbjCompanyDetailAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjCompanyDetailAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjCompanyDetailAdd);
		}
		catch (NoSuchNcbjCompanyDetailAddException noSuchEntityException) {
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
	protected NcbjCompanyDetailAdd removeImpl(
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjCompanyDetailAdd)) {
				ncbjCompanyDetailAdd = (NcbjCompanyDetailAdd)session.get(
					NcbjCompanyDetailAddImpl.class,
					ncbjCompanyDetailAdd.getPrimaryKeyObj());
			}

			if (ncbjCompanyDetailAdd != null) {
				session.delete(ncbjCompanyDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjCompanyDetailAdd != null) {
			clearCache(ncbjCompanyDetailAdd);
		}

		return ncbjCompanyDetailAdd;
	}

	@Override
	public NcbjCompanyDetailAdd updateImpl(
		NcbjCompanyDetailAdd ncbjCompanyDetailAdd) {

		boolean isNew = ncbjCompanyDetailAdd.isNew();

		if (!(ncbjCompanyDetailAdd instanceof NcbjCompanyDetailAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjCompanyDetailAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjCompanyDetailAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjCompanyDetailAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjCompanyDetailAdd implementation " +
					ncbjCompanyDetailAdd.getClass());
		}

		NcbjCompanyDetailAddModelImpl ncbjCompanyDetailAddModelImpl =
			(NcbjCompanyDetailAddModelImpl)ncbjCompanyDetailAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjCompanyDetailAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjCompanyDetailAdd.setCreateDate(date);
			}
			else {
				ncbjCompanyDetailAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjCompanyDetailAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjCompanyDetailAdd.setModifiedDate(date);
			}
			else {
				ncbjCompanyDetailAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjCompanyDetailAdd);
			}
			else {
				ncbjCompanyDetailAdd = (NcbjCompanyDetailAdd)session.merge(
					ncbjCompanyDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjCompanyDetailAddImpl.class, ncbjCompanyDetailAddModelImpl,
			false, true);

		if (isNew) {
			ncbjCompanyDetailAdd.setNew(false);
		}

		ncbjCompanyDetailAdd.resetOriginalValues();

		return ncbjCompanyDetailAdd;
	}

	/**
	 * Returns the ncbj company detail add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj company detail add
	 * @return the ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjCompanyDetailAddException {

		NcbjCompanyDetailAdd ncbjCompanyDetailAdd = fetchByPrimaryKey(
			primaryKey);

		if (ncbjCompanyDetailAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjCompanyDetailAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjCompanyDetailAdd;
	}

	/**
	 * Returns the ncbj company detail add with the primary key or throws a <code>NoSuchNcbjCompanyDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add
	 * @throws NoSuchNcbjCompanyDetailAddException if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd findByPrimaryKey(long ncbjCompanyDetailAddId)
		throws NoSuchNcbjCompanyDetailAddException {

		return findByPrimaryKey((Serializable)ncbjCompanyDetailAddId);
	}

	/**
	 * Returns the ncbj company detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add, or <code>null</code> if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailAdd fetchByPrimaryKey(long ncbjCompanyDetailAddId) {
		return fetchByPrimaryKey((Serializable)ncbjCompanyDetailAddId);
	}

	/**
	 * Returns all the ncbj company detail adds.
	 *
	 * @return the ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj company detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @return the range of ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company detail adds
	 */
	@Override
	public List<NcbjCompanyDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailAdd> orderByComparator,
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

		List<NcbjCompanyDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjCompanyDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJCOMPANYDETAILADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJCOMPANYDETAILADD;

				sql = sql.concat(NcbjCompanyDetailAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjCompanyDetailAdd>)QueryUtil.list(
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
	 * Removes all the ncbj company detail adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjCompanyDetailAdd ncbjCompanyDetailAdd : findAll()) {
			remove(ncbjCompanyDetailAdd);
		}
	}

	/**
	 * Returns the number of ncbj company detail adds.
	 *
	 * @return the number of ncbj company detail adds
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
					_SQL_COUNT_NCBJCOMPANYDETAILADD);

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
		return "ncbjCompanyDetailAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJCOMPANYDETAILADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjCompanyDetailAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj company detail add persistence.
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

		NcbjCompanyDetailAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjCompanyDetailAddUtil.setPersistence(null);

		entityCache.removeCache(NcbjCompanyDetailAddImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJCOMPANYDETAILADD =
		"SELECT ncbjCompanyDetailAdd FROM NcbjCompanyDetailAdd ncbjCompanyDetailAdd";

	private static final String _SQL_SELECT_NCBJCOMPANYDETAILADD_WHERE =
		"SELECT ncbjCompanyDetailAdd FROM NcbjCompanyDetailAdd ncbjCompanyDetailAdd WHERE ";

	private static final String _SQL_COUNT_NCBJCOMPANYDETAILADD =
		"SELECT COUNT(ncbjCompanyDetailAdd) FROM NcbjCompanyDetailAdd ncbjCompanyDetailAdd";

	private static final String _SQL_COUNT_NCBJCOMPANYDETAILADD_WHERE =
		"SELECT COUNT(ncbjCompanyDetailAdd) FROM NcbjCompanyDetailAdd ncbjCompanyDetailAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjCompanyDetailAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjCompanyDetailAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjCompanyDetailAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjCompanyDetailAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}