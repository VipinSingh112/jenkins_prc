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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjNumberEffectiveAddException;
import com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAdd;
import com.nbp.ncbj.application.form.service.model.NcbjNumberEffectiveAddTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjNumberEffectiveAddImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjNumberEffectiveAddModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumberEffectiveAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumberEffectiveAddUtil;
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
 * The persistence implementation for the ncbj number effective add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjNumberEffectiveAddPersistence.class)
public class NcbjNumberEffectiveAddPersistenceImpl
	extends BasePersistenceImpl<NcbjNumberEffectiveAdd>
	implements NcbjNumberEffectiveAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjNumberEffectiveAddUtil</code> to access the ncbj number effective add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjNumberEffectiveAddImpl.class.getName();

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
	 * Returns all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId) {

		return findBygetNCBJById(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @return the range of matching ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end) {

		return findBygetNCBJById(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		return findBygetNCBJById(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findBygetNCBJById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator,
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

		List<NcbjNumberEffectiveAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjNumberEffectiveAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd : list) {
					if (ncbjApplicationId !=
							ncbjNumberEffectiveAdd.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJNUMBEREFFECTIVEADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjNumberEffectiveAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjNumberEffectiveAdd>)QueryUtil.list(
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
	 * Returns the first ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a matching ncbj number effective add could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd findBygetNCBJById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator)
		throws NoSuchNcbjNumberEffectiveAddException {

		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd =
			fetchBygetNCBJById_First(ncbjApplicationId, orderByComparator);

		if (ncbjNumberEffectiveAdd != null) {
			return ncbjNumberEffectiveAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjNumberEffectiveAddException(sb.toString());
	}

	/**
	 * Returns the first ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj number effective add, or <code>null</code> if a matching ncbj number effective add could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd fetchBygetNCBJById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		List<NcbjNumberEffectiveAdd> list = findBygetNCBJById(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a matching ncbj number effective add could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd findBygetNCBJById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator)
		throws NoSuchNcbjNumberEffectiveAddException {

		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd = fetchBygetNCBJById_Last(
			ncbjApplicationId, orderByComparator);

		if (ncbjNumberEffectiveAdd != null) {
			return ncbjNumberEffectiveAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjNumberEffectiveAddException(sb.toString());
	}

	/**
	 * Returns the last ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj number effective add, or <code>null</code> if a matching ncbj number effective add could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd fetchBygetNCBJById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		int count = countBygetNCBJById(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjNumberEffectiveAdd> list = findBygetNCBJById(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj number effective adds before and after the current ncbj number effective add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the current ncbj number effective add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd[] findBygetNCBJById_PrevAndNext(
			long ncbjNumberEffectiveAddId, long ncbjApplicationId,
			OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator)
		throws NoSuchNcbjNumberEffectiveAddException {

		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd = findByPrimaryKey(
			ncbjNumberEffectiveAddId);

		Session session = null;

		try {
			session = openSession();

			NcbjNumberEffectiveAdd[] array = new NcbjNumberEffectiveAddImpl[3];

			array[0] = getBygetNCBJById_PrevAndNext(
				session, ncbjNumberEffectiveAdd, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjNumberEffectiveAdd;

			array[2] = getBygetNCBJById_PrevAndNext(
				session, ncbjNumberEffectiveAdd, ncbjApplicationId,
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

	protected NcbjNumberEffectiveAdd getBygetNCBJById_PrevAndNext(
		Session session, NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd,
		long ncbjApplicationId,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJNUMBEREFFECTIVEADD_WHERE);

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
			sb.append(NcbjNumberEffectiveAddModelImpl.ORDER_BY_JPQL);
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
						ncbjNumberEffectiveAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjNumberEffectiveAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj number effective adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNCBJById(long ncbjApplicationId) {
		for (NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd :
				findBygetNCBJById(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjNumberEffectiveAdd);
		}
	}

	/**
	 * Returns the number of ncbj number effective adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj number effective adds
	 */
	@Override
	public int countBygetNCBJById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJNUMBEREFFECTIVEADD_WHERE);

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
		"ncbjNumberEffectiveAdd.ncbjApplicationId = ?";

	public NcbjNumberEffectiveAddPersistenceImpl() {
		setModelClass(NcbjNumberEffectiveAdd.class);

		setModelImplClass(NcbjNumberEffectiveAddImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjNumberEffectiveAddTable.INSTANCE);
	}

	/**
	 * Caches the ncbj number effective add in the entity cache if it is enabled.
	 *
	 * @param ncbjNumberEffectiveAdd the ncbj number effective add
	 */
	@Override
	public void cacheResult(NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {
		entityCache.putResult(
			NcbjNumberEffectiveAddImpl.class,
			ncbjNumberEffectiveAdd.getPrimaryKey(), ncbjNumberEffectiveAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj number effective adds in the entity cache if it is enabled.
	 *
	 * @param ncbjNumberEffectiveAdds the ncbj number effective adds
	 */
	@Override
	public void cacheResult(
		List<NcbjNumberEffectiveAdd> ncbjNumberEffectiveAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjNumberEffectiveAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd :
				ncbjNumberEffectiveAdds) {

			if (entityCache.getResult(
					NcbjNumberEffectiveAddImpl.class,
					ncbjNumberEffectiveAdd.getPrimaryKey()) == null) {

				cacheResult(ncbjNumberEffectiveAdd);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj number effective adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjNumberEffectiveAddImpl.class);

		finderCache.clearCache(NcbjNumberEffectiveAddImpl.class);
	}

	/**
	 * Clears the cache for the ncbj number effective add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {
		entityCache.removeResult(
			NcbjNumberEffectiveAddImpl.class, ncbjNumberEffectiveAdd);
	}

	@Override
	public void clearCache(
		List<NcbjNumberEffectiveAdd> ncbjNumberEffectiveAdds) {

		for (NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd :
				ncbjNumberEffectiveAdds) {

			entityCache.removeResult(
				NcbjNumberEffectiveAddImpl.class, ncbjNumberEffectiveAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjNumberEffectiveAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjNumberEffectiveAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new ncbj number effective add with the primary key. Does not add the ncbj number effective add to the database.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key for the new ncbj number effective add
	 * @return the new ncbj number effective add
	 */
	@Override
	public NcbjNumberEffectiveAdd create(long ncbjNumberEffectiveAddId) {
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd =
			new NcbjNumberEffectiveAddImpl();

		ncbjNumberEffectiveAdd.setNew(true);
		ncbjNumberEffectiveAdd.setPrimaryKey(ncbjNumberEffectiveAddId);

		ncbjNumberEffectiveAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjNumberEffectiveAdd;
	}

	/**
	 * Removes the ncbj number effective add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add that was removed
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd remove(long ncbjNumberEffectiveAddId)
		throws NoSuchNcbjNumberEffectiveAddException {

		return remove((Serializable)ncbjNumberEffectiveAddId);
	}

	/**
	 * Removes the ncbj number effective add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj number effective add
	 * @return the ncbj number effective add that was removed
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd remove(Serializable primaryKey)
		throws NoSuchNcbjNumberEffectiveAddException {

		Session session = null;

		try {
			session = openSession();

			NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd =
				(NcbjNumberEffectiveAdd)session.get(
					NcbjNumberEffectiveAddImpl.class, primaryKey);

			if (ncbjNumberEffectiveAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjNumberEffectiveAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjNumberEffectiveAdd);
		}
		catch (NoSuchNcbjNumberEffectiveAddException noSuchEntityException) {
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
	protected NcbjNumberEffectiveAdd removeImpl(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjNumberEffectiveAdd)) {
				ncbjNumberEffectiveAdd = (NcbjNumberEffectiveAdd)session.get(
					NcbjNumberEffectiveAddImpl.class,
					ncbjNumberEffectiveAdd.getPrimaryKeyObj());
			}

			if (ncbjNumberEffectiveAdd != null) {
				session.delete(ncbjNumberEffectiveAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjNumberEffectiveAdd != null) {
			clearCache(ncbjNumberEffectiveAdd);
		}

		return ncbjNumberEffectiveAdd;
	}

	@Override
	public NcbjNumberEffectiveAdd updateImpl(
		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd) {

		boolean isNew = ncbjNumberEffectiveAdd.isNew();

		if (!(ncbjNumberEffectiveAdd instanceof
				NcbjNumberEffectiveAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjNumberEffectiveAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjNumberEffectiveAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjNumberEffectiveAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjNumberEffectiveAdd implementation " +
					ncbjNumberEffectiveAdd.getClass());
		}

		NcbjNumberEffectiveAddModelImpl ncbjNumberEffectiveAddModelImpl =
			(NcbjNumberEffectiveAddModelImpl)ncbjNumberEffectiveAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjNumberEffectiveAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjNumberEffectiveAdd.setCreateDate(date);
			}
			else {
				ncbjNumberEffectiveAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjNumberEffectiveAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjNumberEffectiveAdd.setModifiedDate(date);
			}
			else {
				ncbjNumberEffectiveAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjNumberEffectiveAdd);
			}
			else {
				ncbjNumberEffectiveAdd = (NcbjNumberEffectiveAdd)session.merge(
					ncbjNumberEffectiveAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjNumberEffectiveAddImpl.class, ncbjNumberEffectiveAddModelImpl,
			false, true);

		if (isNew) {
			ncbjNumberEffectiveAdd.setNew(false);
		}

		ncbjNumberEffectiveAdd.resetOriginalValues();

		return ncbjNumberEffectiveAdd;
	}

	/**
	 * Returns the ncbj number effective add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj number effective add
	 * @return the ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjNumberEffectiveAddException {

		NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd = fetchByPrimaryKey(
			primaryKey);

		if (ncbjNumberEffectiveAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjNumberEffectiveAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjNumberEffectiveAdd;
	}

	/**
	 * Returns the ncbj number effective add with the primary key or throws a <code>NoSuchNcbjNumberEffectiveAddException</code> if it could not be found.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add
	 * @throws NoSuchNcbjNumberEffectiveAddException if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd findByPrimaryKey(
			long ncbjNumberEffectiveAddId)
		throws NoSuchNcbjNumberEffectiveAddException {

		return findByPrimaryKey((Serializable)ncbjNumberEffectiveAddId);
	}

	/**
	 * Returns the ncbj number effective add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjNumberEffectiveAddId the primary key of the ncbj number effective add
	 * @return the ncbj number effective add, or <code>null</code> if a ncbj number effective add with the primary key could not be found
	 */
	@Override
	public NcbjNumberEffectiveAdd fetchByPrimaryKey(
		long ncbjNumberEffectiveAddId) {

		return fetchByPrimaryKey((Serializable)ncbjNumberEffectiveAddId);
	}

	/**
	 * Returns all the ncbj number effective adds.
	 *
	 * @return the ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj number effective adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @return the range of ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj number effective adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumberEffectiveAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj number effective adds
	 * @param end the upper bound of the range of ncbj number effective adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj number effective adds
	 */
	@Override
	public List<NcbjNumberEffectiveAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumberEffectiveAdd> orderByComparator,
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

		List<NcbjNumberEffectiveAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjNumberEffectiveAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJNUMBEREFFECTIVEADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJNUMBEREFFECTIVEADD;

				sql = sql.concat(NcbjNumberEffectiveAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjNumberEffectiveAdd>)QueryUtil.list(
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
	 * Removes all the ncbj number effective adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd : findAll()) {
			remove(ncbjNumberEffectiveAdd);
		}
	}

	/**
	 * Returns the number of ncbj number effective adds.
	 *
	 * @return the number of ncbj number effective adds
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
					_SQL_COUNT_NCBJNUMBEREFFECTIVEADD);

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
		return "ncbjNumberEffectiveAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJNUMBEREFFECTIVEADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjNumberEffectiveAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj number effective add persistence.
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

		NcbjNumberEffectiveAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjNumberEffectiveAddUtil.setPersistence(null);

		entityCache.removeCache(NcbjNumberEffectiveAddImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJNUMBEREFFECTIVEADD =
		"SELECT ncbjNumberEffectiveAdd FROM NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd";

	private static final String _SQL_SELECT_NCBJNUMBEREFFECTIVEADD_WHERE =
		"SELECT ncbjNumberEffectiveAdd FROM NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd WHERE ";

	private static final String _SQL_COUNT_NCBJNUMBEREFFECTIVEADD =
		"SELECT COUNT(ncbjNumberEffectiveAdd) FROM NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd";

	private static final String _SQL_COUNT_NCBJNUMBEREFFECTIVEADD_WHERE =
		"SELECT COUNT(ncbjNumberEffectiveAdd) FROM NcbjNumberEffectiveAdd ncbjNumberEffectiveAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjNumberEffectiveAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjNumberEffectiveAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjNumberEffectiveAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjNumberEffectiveAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}