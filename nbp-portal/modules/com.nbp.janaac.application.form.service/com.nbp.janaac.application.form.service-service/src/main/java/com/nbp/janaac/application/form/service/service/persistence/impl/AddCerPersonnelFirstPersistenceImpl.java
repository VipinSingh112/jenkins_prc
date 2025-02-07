/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerPersonnelFirstException;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirst;
import com.nbp.janaac.application.form.service.model.AddCerPersonnelFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerPersonnelFirstModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerPersonnelFirstUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the add cer personnel first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddCerPersonnelFirstPersistence.class)
public class AddCerPersonnelFirstPersistenceImpl
	extends BasePersistenceImpl<AddCerPersonnelFirst>
	implements AddCerPersonnelFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddCerPersonnelFirstUtil</code> to access the add cer personnel first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddCerPersonnelFirstImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @return the range of matching add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddCerPersonnelFirst> list = null;

		if (useFinderCache) {
			list = (List<AddCerPersonnelFirst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddCerPersonnelFirst addCerPersonnelFirst : list) {
					if (janaacApplicationId !=
							addCerPersonnelFirst.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDCERPERSONNELFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddCerPersonnelFirstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddCerPersonnelFirst>)QueryUtil.list(
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
	 * Returns the first add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a matching add cer personnel first could not be found
	 */
	@Override
	public AddCerPersonnelFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelFirst> orderByComparator)
		throws NoSuchAddCerPersonnelFirstException {

		AddCerPersonnelFirst addCerPersonnelFirst = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addCerPersonnelFirst != null) {
			return addCerPersonnelFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerPersonnelFirstException(sb.toString());
	}

	/**
	 * Returns the first add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer personnel first, or <code>null</code> if a matching add cer personnel first could not be found
	 */
	@Override
	public AddCerPersonnelFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		List<AddCerPersonnelFirst> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a matching add cer personnel first could not be found
	 */
	@Override
	public AddCerPersonnelFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerPersonnelFirst> orderByComparator)
		throws NoSuchAddCerPersonnelFirstException {

		AddCerPersonnelFirst addCerPersonnelFirst = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addCerPersonnelFirst != null) {
			return addCerPersonnelFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerPersonnelFirstException(sb.toString());
	}

	/**
	 * Returns the last add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer personnel first, or <code>null</code> if a matching add cer personnel first could not be found
	 */
	@Override
	public AddCerPersonnelFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddCerPersonnelFirst> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add cer personnel firsts before and after the current add cer personnel first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerPersonnelFirstId the primary key of the current add cer personnel first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelFirst[] findBygetJanaacById_PrevAndNext(
			long addCerPersonnelFirstId, long janaacApplicationId,
			OrderByComparator<AddCerPersonnelFirst> orderByComparator)
		throws NoSuchAddCerPersonnelFirstException {

		AddCerPersonnelFirst addCerPersonnelFirst = findByPrimaryKey(
			addCerPersonnelFirstId);

		Session session = null;

		try {
			session = openSession();

			AddCerPersonnelFirst[] array = new AddCerPersonnelFirstImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addCerPersonnelFirst, janaacApplicationId,
				orderByComparator, true);

			array[1] = addCerPersonnelFirst;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addCerPersonnelFirst, janaacApplicationId,
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

	protected AddCerPersonnelFirst getBygetJanaacById_PrevAndNext(
		Session session, AddCerPersonnelFirst addCerPersonnelFirst,
		long janaacApplicationId,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDCERPERSONNELFIRST_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddCerPersonnelFirstModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addCerPersonnelFirst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddCerPersonnelFirst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add cer personnel firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddCerPersonnelFirst addCerPersonnelFirst :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addCerPersonnelFirst);
		}
	}

	/**
	 * Returns the number of add cer personnel firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer personnel firsts
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDCERPERSONNELFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addCerPersonnelFirst.janaacApplicationId = ?";

	public AddCerPersonnelFirstPersistenceImpl() {
		setModelClass(AddCerPersonnelFirst.class);

		setModelImplClass(AddCerPersonnelFirstImpl.class);
		setModelPKClass(long.class);

		setTable(AddCerPersonnelFirstTable.INSTANCE);
	}

	/**
	 * Caches the add cer personnel first in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelFirst the add cer personnel first
	 */
	@Override
	public void cacheResult(AddCerPersonnelFirst addCerPersonnelFirst) {
		entityCache.putResult(
			AddCerPersonnelFirstImpl.class,
			addCerPersonnelFirst.getPrimaryKey(), addCerPersonnelFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add cer personnel firsts in the entity cache if it is enabled.
	 *
	 * @param addCerPersonnelFirsts the add cer personnel firsts
	 */
	@Override
	public void cacheResult(List<AddCerPersonnelFirst> addCerPersonnelFirsts) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addCerPersonnelFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddCerPersonnelFirst addCerPersonnelFirst :
				addCerPersonnelFirsts) {

			if (entityCache.getResult(
					AddCerPersonnelFirstImpl.class,
					addCerPersonnelFirst.getPrimaryKey()) == null) {

				cacheResult(addCerPersonnelFirst);
			}
		}
	}

	/**
	 * Clears the cache for all add cer personnel firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddCerPersonnelFirstImpl.class);

		finderCache.clearCache(AddCerPersonnelFirstImpl.class);
	}

	/**
	 * Clears the cache for the add cer personnel first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddCerPersonnelFirst addCerPersonnelFirst) {
		entityCache.removeResult(
			AddCerPersonnelFirstImpl.class, addCerPersonnelFirst);
	}

	@Override
	public void clearCache(List<AddCerPersonnelFirst> addCerPersonnelFirsts) {
		for (AddCerPersonnelFirst addCerPersonnelFirst :
				addCerPersonnelFirsts) {

			entityCache.removeResult(
				AddCerPersonnelFirstImpl.class, addCerPersonnelFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddCerPersonnelFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddCerPersonnelFirstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add cer personnel first with the primary key. Does not add the add cer personnel first to the database.
	 *
	 * @param addCerPersonnelFirstId the primary key for the new add cer personnel first
	 * @return the new add cer personnel first
	 */
	@Override
	public AddCerPersonnelFirst create(long addCerPersonnelFirstId) {
		AddCerPersonnelFirst addCerPersonnelFirst =
			new AddCerPersonnelFirstImpl();

		addCerPersonnelFirst.setNew(true);
		addCerPersonnelFirst.setPrimaryKey(addCerPersonnelFirstId);

		addCerPersonnelFirst.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addCerPersonnelFirst;
	}

	/**
	 * Removes the add cer personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first that was removed
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelFirst remove(long addCerPersonnelFirstId)
		throws NoSuchAddCerPersonnelFirstException {

		return remove((Serializable)addCerPersonnelFirstId);
	}

	/**
	 * Removes the add cer personnel first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add cer personnel first
	 * @return the add cer personnel first that was removed
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelFirst remove(Serializable primaryKey)
		throws NoSuchAddCerPersonnelFirstException {

		Session session = null;

		try {
			session = openSession();

			AddCerPersonnelFirst addCerPersonnelFirst =
				(AddCerPersonnelFirst)session.get(
					AddCerPersonnelFirstImpl.class, primaryKey);

			if (addCerPersonnelFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddCerPersonnelFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addCerPersonnelFirst);
		}
		catch (NoSuchAddCerPersonnelFirstException noSuchEntityException) {
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
	protected AddCerPersonnelFirst removeImpl(
		AddCerPersonnelFirst addCerPersonnelFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addCerPersonnelFirst)) {
				addCerPersonnelFirst = (AddCerPersonnelFirst)session.get(
					AddCerPersonnelFirstImpl.class,
					addCerPersonnelFirst.getPrimaryKeyObj());
			}

			if (addCerPersonnelFirst != null) {
				session.delete(addCerPersonnelFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addCerPersonnelFirst != null) {
			clearCache(addCerPersonnelFirst);
		}

		return addCerPersonnelFirst;
	}

	@Override
	public AddCerPersonnelFirst updateImpl(
		AddCerPersonnelFirst addCerPersonnelFirst) {

		boolean isNew = addCerPersonnelFirst.isNew();

		if (!(addCerPersonnelFirst instanceof AddCerPersonnelFirstModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addCerPersonnelFirst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addCerPersonnelFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addCerPersonnelFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddCerPersonnelFirst implementation " +
					addCerPersonnelFirst.getClass());
		}

		AddCerPersonnelFirstModelImpl addCerPersonnelFirstModelImpl =
			(AddCerPersonnelFirstModelImpl)addCerPersonnelFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addCerPersonnelFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				addCerPersonnelFirst.setCreateDate(date);
			}
			else {
				addCerPersonnelFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addCerPersonnelFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addCerPersonnelFirst.setModifiedDate(date);
			}
			else {
				addCerPersonnelFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addCerPersonnelFirst);
			}
			else {
				addCerPersonnelFirst = (AddCerPersonnelFirst)session.merge(
					addCerPersonnelFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddCerPersonnelFirstImpl.class, addCerPersonnelFirstModelImpl,
			false, true);

		if (isNew) {
			addCerPersonnelFirst.setNew(false);
		}

		addCerPersonnelFirst.resetOriginalValues();

		return addCerPersonnelFirst;
	}

	/**
	 * Returns the add cer personnel first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add cer personnel first
	 * @return the add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelFirst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddCerPersonnelFirstException {

		AddCerPersonnelFirst addCerPersonnelFirst = fetchByPrimaryKey(
			primaryKey);

		if (addCerPersonnelFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddCerPersonnelFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addCerPersonnelFirst;
	}

	/**
	 * Returns the add cer personnel first with the primary key or throws a <code>NoSuchAddCerPersonnelFirstException</code> if it could not be found.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first
	 * @throws NoSuchAddCerPersonnelFirstException if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelFirst findByPrimaryKey(long addCerPersonnelFirstId)
		throws NoSuchAddCerPersonnelFirstException {

		return findByPrimaryKey((Serializable)addCerPersonnelFirstId);
	}

	/**
	 * Returns the add cer personnel first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerPersonnelFirstId the primary key of the add cer personnel first
	 * @return the add cer personnel first, or <code>null</code> if a add cer personnel first with the primary key could not be found
	 */
	@Override
	public AddCerPersonnelFirst fetchByPrimaryKey(long addCerPersonnelFirstId) {
		return fetchByPrimaryKey((Serializable)addCerPersonnelFirstId);
	}

	/**
	 * Returns all the add cer personnel firsts.
	 *
	 * @return the add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @return the range of add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer personnel firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerPersonnelFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer personnel firsts
	 * @param end the upper bound of the range of add cer personnel firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer personnel firsts
	 */
	@Override
	public List<AddCerPersonnelFirst> findAll(
		int start, int end,
		OrderByComparator<AddCerPersonnelFirst> orderByComparator,
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

		List<AddCerPersonnelFirst> list = null;

		if (useFinderCache) {
			list = (List<AddCerPersonnelFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDCERPERSONNELFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDCERPERSONNELFIRST;

				sql = sql.concat(AddCerPersonnelFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddCerPersonnelFirst>)QueryUtil.list(
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
	 * Removes all the add cer personnel firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddCerPersonnelFirst addCerPersonnelFirst : findAll()) {
			remove(addCerPersonnelFirst);
		}
	}

	/**
	 * Returns the number of add cer personnel firsts.
	 *
	 * @return the number of add cer personnel firsts
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
					_SQL_COUNT_ADDCERPERSONNELFIRST);

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
		return "addCerPersonnelFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDCERPERSONNELFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddCerPersonnelFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add cer personnel first persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddCerPersonnelFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddCerPersonnelFirstUtil.setPersistence(null);

		entityCache.removeCache(AddCerPersonnelFirstImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDCERPERSONNELFIRST =
		"SELECT addCerPersonnelFirst FROM AddCerPersonnelFirst addCerPersonnelFirst";

	private static final String _SQL_SELECT_ADDCERPERSONNELFIRST_WHERE =
		"SELECT addCerPersonnelFirst FROM AddCerPersonnelFirst addCerPersonnelFirst WHERE ";

	private static final String _SQL_COUNT_ADDCERPERSONNELFIRST =
		"SELECT COUNT(addCerPersonnelFirst) FROM AddCerPersonnelFirst addCerPersonnelFirst";

	private static final String _SQL_COUNT_ADDCERPERSONNELFIRST_WHERE =
		"SELECT COUNT(addCerPersonnelFirst) FROM AddCerPersonnelFirst addCerPersonnelFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addCerPersonnelFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddCerPersonnelFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddCerPersonnelFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddCerPersonnelFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}