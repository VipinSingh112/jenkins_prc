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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabMedicalOrganFirstException;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirst;
import com.nbp.janaac.application.form.service.model.AddLabMedicalOrganFirstTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganFirstModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalOrganFirstPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabMedicalOrganFirstUtil;
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
 * The persistence implementation for the add lab medical organ first service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabMedicalOrganFirstPersistence.class)
public class AddLabMedicalOrganFirstPersistenceImpl
	extends BasePersistenceImpl<AddLabMedicalOrganFirst>
	implements AddLabMedicalOrganFirstPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabMedicalOrganFirstUtil</code> to access the add lab medical organ first persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabMedicalOrganFirstImpl.class.getName();

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
	 * Returns all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @return the range of matching add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator,
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

		List<AddLabMedicalOrganFirst> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalOrganFirst>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabMedicalOrganFirst addLabMedicalOrganFirst : list) {
					if (janaacApplicationId !=
							addLabMedicalOrganFirst.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABMEDICALORGANFIRST_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabMedicalOrganFirstModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabMedicalOrganFirst>)QueryUtil.list(
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
	 * Returns the first add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a matching add lab medical organ first could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganFirst> orderByComparator)
		throws NoSuchAddLabMedicalOrganFirstException {

		AddLabMedicalOrganFirst addLabMedicalOrganFirst =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addLabMedicalOrganFirst != null) {
			return addLabMedicalOrganFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalOrganFirstException(sb.toString());
	}

	/**
	 * Returns the first add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab medical organ first, or <code>null</code> if a matching add lab medical organ first could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		List<AddLabMedicalOrganFirst> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a matching add lab medical organ first could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganFirst> orderByComparator)
		throws NoSuchAddLabMedicalOrganFirstException {

		AddLabMedicalOrganFirst addLabMedicalOrganFirst =
			fetchBygetJanaacById_Last(janaacApplicationId, orderByComparator);

		if (addLabMedicalOrganFirst != null) {
			return addLabMedicalOrganFirst;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabMedicalOrganFirstException(sb.toString());
	}

	/**
	 * Returns the last add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab medical organ first, or <code>null</code> if a matching add lab medical organ first could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabMedicalOrganFirst> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab medical organ firsts before and after the current add lab medical organ first in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the current add lab medical organ first
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst[] findBygetJanaacById_PrevAndNext(
			long addLabMedicalOrganFirstId, long janaacApplicationId,
			OrderByComparator<AddLabMedicalOrganFirst> orderByComparator)
		throws NoSuchAddLabMedicalOrganFirstException {

		AddLabMedicalOrganFirst addLabMedicalOrganFirst = findByPrimaryKey(
			addLabMedicalOrganFirstId);

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalOrganFirst[] array =
				new AddLabMedicalOrganFirstImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalOrganFirst, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabMedicalOrganFirst;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabMedicalOrganFirst, janaacApplicationId,
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

	protected AddLabMedicalOrganFirst getBygetJanaacById_PrevAndNext(
		Session session, AddLabMedicalOrganFirst addLabMedicalOrganFirst,
		long janaacApplicationId,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABMEDICALORGANFIRST_WHERE);

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
			sb.append(AddLabMedicalOrganFirstModelImpl.ORDER_BY_JPQL);
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
						addLabMedicalOrganFirst)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabMedicalOrganFirst> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab medical organ firsts where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabMedicalOrganFirst addLabMedicalOrganFirst :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabMedicalOrganFirst);
		}
	}

	/**
	 * Returns the number of add lab medical organ firsts where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab medical organ firsts
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABMEDICALORGANFIRST_WHERE);

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
			"addLabMedicalOrganFirst.janaacApplicationId = ?";

	public AddLabMedicalOrganFirstPersistenceImpl() {
		setModelClass(AddLabMedicalOrganFirst.class);

		setModelImplClass(AddLabMedicalOrganFirstImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabMedicalOrganFirstTable.INSTANCE);
	}

	/**
	 * Caches the add lab medical organ first in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganFirst the add lab medical organ first
	 */
	@Override
	public void cacheResult(AddLabMedicalOrganFirst addLabMedicalOrganFirst) {
		entityCache.putResult(
			AddLabMedicalOrganFirstImpl.class,
			addLabMedicalOrganFirst.getPrimaryKey(), addLabMedicalOrganFirst);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab medical organ firsts in the entity cache if it is enabled.
	 *
	 * @param addLabMedicalOrganFirsts the add lab medical organ firsts
	 */
	@Override
	public void cacheResult(
		List<AddLabMedicalOrganFirst> addLabMedicalOrganFirsts) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabMedicalOrganFirsts.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabMedicalOrganFirst addLabMedicalOrganFirst :
				addLabMedicalOrganFirsts) {

			if (entityCache.getResult(
					AddLabMedicalOrganFirstImpl.class,
					addLabMedicalOrganFirst.getPrimaryKey()) == null) {

				cacheResult(addLabMedicalOrganFirst);
			}
		}
	}

	/**
	 * Clears the cache for all add lab medical organ firsts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabMedicalOrganFirstImpl.class);

		finderCache.clearCache(AddLabMedicalOrganFirstImpl.class);
	}

	/**
	 * Clears the cache for the add lab medical organ first.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabMedicalOrganFirst addLabMedicalOrganFirst) {
		entityCache.removeResult(
			AddLabMedicalOrganFirstImpl.class, addLabMedicalOrganFirst);
	}

	@Override
	public void clearCache(
		List<AddLabMedicalOrganFirst> addLabMedicalOrganFirsts) {

		for (AddLabMedicalOrganFirst addLabMedicalOrganFirst :
				addLabMedicalOrganFirsts) {

			entityCache.removeResult(
				AddLabMedicalOrganFirstImpl.class, addLabMedicalOrganFirst);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabMedicalOrganFirstImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabMedicalOrganFirstImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab medical organ first with the primary key. Does not add the add lab medical organ first to the database.
	 *
	 * @param addLabMedicalOrganFirstId the primary key for the new add lab medical organ first
	 * @return the new add lab medical organ first
	 */
	@Override
	public AddLabMedicalOrganFirst create(long addLabMedicalOrganFirstId) {
		AddLabMedicalOrganFirst addLabMedicalOrganFirst =
			new AddLabMedicalOrganFirstImpl();

		addLabMedicalOrganFirst.setNew(true);
		addLabMedicalOrganFirst.setPrimaryKey(addLabMedicalOrganFirstId);

		addLabMedicalOrganFirst.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addLabMedicalOrganFirst;
	}

	/**
	 * Removes the add lab medical organ first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first that was removed
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst remove(long addLabMedicalOrganFirstId)
		throws NoSuchAddLabMedicalOrganFirstException {

		return remove((Serializable)addLabMedicalOrganFirstId);
	}

	/**
	 * Removes the add lab medical organ first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab medical organ first
	 * @return the add lab medical organ first that was removed
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst remove(Serializable primaryKey)
		throws NoSuchAddLabMedicalOrganFirstException {

		Session session = null;

		try {
			session = openSession();

			AddLabMedicalOrganFirst addLabMedicalOrganFirst =
				(AddLabMedicalOrganFirst)session.get(
					AddLabMedicalOrganFirstImpl.class, primaryKey);

			if (addLabMedicalOrganFirst == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabMedicalOrganFirstException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabMedicalOrganFirst);
		}
		catch (NoSuchAddLabMedicalOrganFirstException noSuchEntityException) {
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
	protected AddLabMedicalOrganFirst removeImpl(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabMedicalOrganFirst)) {
				addLabMedicalOrganFirst = (AddLabMedicalOrganFirst)session.get(
					AddLabMedicalOrganFirstImpl.class,
					addLabMedicalOrganFirst.getPrimaryKeyObj());
			}

			if (addLabMedicalOrganFirst != null) {
				session.delete(addLabMedicalOrganFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabMedicalOrganFirst != null) {
			clearCache(addLabMedicalOrganFirst);
		}

		return addLabMedicalOrganFirst;
	}

	@Override
	public AddLabMedicalOrganFirst updateImpl(
		AddLabMedicalOrganFirst addLabMedicalOrganFirst) {

		boolean isNew = addLabMedicalOrganFirst.isNew();

		if (!(addLabMedicalOrganFirst instanceof
				AddLabMedicalOrganFirstModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabMedicalOrganFirst.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabMedicalOrganFirst);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabMedicalOrganFirst proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabMedicalOrganFirst implementation " +
					addLabMedicalOrganFirst.getClass());
		}

		AddLabMedicalOrganFirstModelImpl addLabMedicalOrganFirstModelImpl =
			(AddLabMedicalOrganFirstModelImpl)addLabMedicalOrganFirst;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabMedicalOrganFirst.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabMedicalOrganFirst.setCreateDate(date);
			}
			else {
				addLabMedicalOrganFirst.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabMedicalOrganFirstModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabMedicalOrganFirst.setModifiedDate(date);
			}
			else {
				addLabMedicalOrganFirst.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabMedicalOrganFirst);
			}
			else {
				addLabMedicalOrganFirst =
					(AddLabMedicalOrganFirst)session.merge(
						addLabMedicalOrganFirst);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabMedicalOrganFirstImpl.class, addLabMedicalOrganFirstModelImpl,
			false, true);

		if (isNew) {
			addLabMedicalOrganFirst.setNew(false);
		}

		addLabMedicalOrganFirst.resetOriginalValues();

		return addLabMedicalOrganFirst;
	}

	/**
	 * Returns the add lab medical organ first with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab medical organ first
	 * @return the add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabMedicalOrganFirstException {

		AddLabMedicalOrganFirst addLabMedicalOrganFirst = fetchByPrimaryKey(
			primaryKey);

		if (addLabMedicalOrganFirst == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabMedicalOrganFirstException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabMedicalOrganFirst;
	}

	/**
	 * Returns the add lab medical organ first with the primary key or throws a <code>NoSuchAddLabMedicalOrganFirstException</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first
	 * @throws NoSuchAddLabMedicalOrganFirstException if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst findByPrimaryKey(
			long addLabMedicalOrganFirstId)
		throws NoSuchAddLabMedicalOrganFirstException {

		return findByPrimaryKey((Serializable)addLabMedicalOrganFirstId);
	}

	/**
	 * Returns the add lab medical organ first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabMedicalOrganFirstId the primary key of the add lab medical organ first
	 * @return the add lab medical organ first, or <code>null</code> if a add lab medical organ first with the primary key could not be found
	 */
	@Override
	public AddLabMedicalOrganFirst fetchByPrimaryKey(
		long addLabMedicalOrganFirstId) {

		return fetchByPrimaryKey((Serializable)addLabMedicalOrganFirstId);
	}

	/**
	 * Returns all the add lab medical organ firsts.
	 *
	 * @return the add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @return the range of add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab medical organ firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabMedicalOrganFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical organ firsts
	 * @param end the upper bound of the range of add lab medical organ firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab medical organ firsts
	 */
	@Override
	public List<AddLabMedicalOrganFirst> findAll(
		int start, int end,
		OrderByComparator<AddLabMedicalOrganFirst> orderByComparator,
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

		List<AddLabMedicalOrganFirst> list = null;

		if (useFinderCache) {
			list = (List<AddLabMedicalOrganFirst>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABMEDICALORGANFIRST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABMEDICALORGANFIRST;

				sql = sql.concat(
					AddLabMedicalOrganFirstModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabMedicalOrganFirst>)QueryUtil.list(
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
	 * Removes all the add lab medical organ firsts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabMedicalOrganFirst addLabMedicalOrganFirst : findAll()) {
			remove(addLabMedicalOrganFirst);
		}
	}

	/**
	 * Returns the number of add lab medical organ firsts.
	 *
	 * @return the number of add lab medical organ firsts
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
					_SQL_COUNT_ADDLABMEDICALORGANFIRST);

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
		return "addLabMedicalOrganFirstId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABMEDICALORGANFIRST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabMedicalOrganFirstModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab medical organ first persistence.
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

		AddLabMedicalOrganFirstUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabMedicalOrganFirstUtil.setPersistence(null);

		entityCache.removeCache(AddLabMedicalOrganFirstImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABMEDICALORGANFIRST =
		"SELECT addLabMedicalOrganFirst FROM AddLabMedicalOrganFirst addLabMedicalOrganFirst";

	private static final String _SQL_SELECT_ADDLABMEDICALORGANFIRST_WHERE =
		"SELECT addLabMedicalOrganFirst FROM AddLabMedicalOrganFirst addLabMedicalOrganFirst WHERE ";

	private static final String _SQL_COUNT_ADDLABMEDICALORGANFIRST =
		"SELECT COUNT(addLabMedicalOrganFirst) FROM AddLabMedicalOrganFirst addLabMedicalOrganFirst";

	private static final String _SQL_COUNT_ADDLABMEDICALORGANFIRST_WHERE =
		"SELECT COUNT(addLabMedicalOrganFirst) FROM AddLabMedicalOrganFirst addLabMedicalOrganFirst WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabMedicalOrganFirst.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabMedicalOrganFirst exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabMedicalOrganFirst exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabMedicalOrganFirstPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}